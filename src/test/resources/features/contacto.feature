@contacto
Feature: Formulario de contacto del hotel
  Como huesped interesado en Shadow Meadow B&B
  Quiero enviar un mensaje desde la web al hotel
  Para resolver mis dudas antes de reservar

  Background:
    Given que Juan esta en la pagina principal del hotel


    @smoke @regresion
  Scenario: Enviar un mensaje con datos validos
    When envia un mensaje con los siguiente datos
      | nombre   | Juan Ruiz                                       |
      | correo   | juan.ruiz@correo.com                            |
      | telefono | +51 987654321                                   |
      | asunto   | Consulta de reserva                             |
      | mensaje  | Quisiera saber si aceptan mascotas en la suite. |
    Then ve el agradimiento "Thanks for getting in touch Juan Ruiz!"
    And ve que su consulta es sobre "Consulta de reserva"

      @smoke @validaciones
  Scenario Outline: No permite enviar el mensaje cuando <caso>
    When envia un mensaje con los siguiente datos
      | nombre   | <nombre>   |
      | correo   | <correo>   |
      | telefono | <telefono> |
      | asunto   | <asunto>   |
      | mensaje  | <mensaje>  |
    Then ve el error "<error>"

    Examples:
      | caso                     | nombre    | correo                | telefono      | asunto           | mensaje                                         | error                                           |
      | el telefono es muy corto | Juan Ruiz | juan.ruiz@correo.com. | +51 987654321 | Consulta Reserva | Quisiera saber si aceptan mascotas en la suite. | Phone must be between 11 and 21 characters.     |
      | el asunto es muy corto   | Juan Ruiz | juan.ruiz@correo.com. | +51 987654321 | Hola             | Quisiera saber si aceptan mascotas en la suite. | Subject must be between 5 and 100 characters.   |
      | el mensaje es muy corto  | Juan Ruiz | juan.ruiz@correo.com. | +51 987654321 | Consulta Reserva | Hola, buen dia                                  | Message must be between 20 and 2000 characters. |
      | else nombre esta vacio   |           | juan.ruiz@correo.com. | +51 987654321 | Consulta Reserva | Quisiera saber si aceptan mascotas en la suite. | Name may not be blank                           |