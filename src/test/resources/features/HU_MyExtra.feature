#Author: alrpena@bancolombia.com
@tag
Feature: Aprendiendo a automatizar en MyExtra
  I want to use this template for my feature file

  @Caso01
  Scenario: Ingresar a MyExtra
    Given Rafa desea realizar consultas en AS400, Rafa abre MyExtra
    When el ingresa sus credenciales
      | usuario  | contrasena |
      | CALRPENA | NEFERTITI3 |
    And navega en un menu
    Then verifica que inicio sesion correctamente

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | usuario  | contrasena |
      | CALRPENA | NEFERTITI3 |
