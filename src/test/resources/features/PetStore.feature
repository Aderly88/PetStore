Feature: PetStore API

  @consulta
  Scenario:Consulta mascota

    Given la url es "https://petstore.swagger.io/v2"
    When consulto la mascota con ID "2"
    Then valido el codigo de respuesta sea 200
    And valido que el nombre de la mascota sea "Yango"

  @CrearMascota
  Scenario: Crear Macota

    Given la url es "https://petstore.swagger.io/v2"
    When creo la mascota "Caramelo" con ID "88"
    Then valido el codigo de respuesta sea 200




