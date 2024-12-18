Feature: Test Assertion

  @TestAssertion

  Scenario Outline: prueba de login exitoso
    Given prueba de assertion
    When pruebo un servicio url "https://www.google.com"
    And inicio sesion con "<usuario>" y "<clave>"

    Examples:
      | usuario | clave     | url        |
      | Aderly  | 123121232 | google.com |
      | Mica    | 000000    | nttdata    |

