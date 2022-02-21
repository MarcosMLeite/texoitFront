#Author: marcos.leite21@gmail.com

@executa
Feature: Validar id json
  
  Scenario: Validar id 
    Given que eu acesse o site "https://jsonplaceholder.typicode.com/"
    And  clicar no menu
    When clicar na aba album
    Then valido id desejado. 
    