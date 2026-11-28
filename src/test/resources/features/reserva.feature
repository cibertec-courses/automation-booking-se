@reserva
Feature: Resreva de habitaciones
  Como huesped de Shady Meadows B&B
  Quiero reservar una habitacion por internet
  Para asegurar mi estadia sin tener que llamar al hotel

  @smoke @regresseion @limpiar-reserva
  Scenario: Reservar una habitacion con datos validos
    Given que Lucia quiere reservar la habitacion Single por 2 noces
    When completa la reserva con los siguientes datos
      | nombre   | Lucia                   |
      | apellido | Torres                  |
      | correo   | lucia.torres@correo.com |
      | telefono | +51 987654321           |
    Then ve que su reserva fue confirmada
    And ve las fechas de su estadia en la confirmacion

  @regression
  Scenario Outline: El resumen calcula el total de <noches> noches en la habitalacion <habitacion>
    Given que Lucia quiere reservar la habitacion <habitacion> por <noches> noches
    Then ve que el total a paga es "<total>"

    Examples:
      | habitacion | noches | total |
      | Single     | 1      | £140  |
      | Double     | 3      | £490  |
      | Suite      | 3      | £715  |

  @regression @validaciones
  Scenario Outline: No permite reservar cuando <caso>
    When completa la reservar con los siguientes datos
      | nombre   | <nombre>   |
      | apellido | <apellido> |
      | correo   | <correo>   |
      | telefono | <telefono> |
    Then ve el error "<error>"

    Examples:
      | caso                     | nombre | apellido | correo                  | telefono      | error                               |
      | el nombre es muy corto   | Lu     | Torres   | lucia.torres@correo.com | +51 987654321 | size must be between 3 and 18       |
      | el apellido esta vacio   | Lucia  |          | lucia.torres@correo.com | +51 987654321 | Lastname should not be blank        |
      | el correo no es valido   | Lucia  | Torres   | lucia.torres            | +51 987654321 | must be a well-formed email address |
      | el telefono es muy corto | Lucia  | Torres   | lucia.torres@correo.com | 87654321      | size must be between 11 and 21      |

