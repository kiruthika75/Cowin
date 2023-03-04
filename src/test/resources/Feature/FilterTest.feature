
Feature: Cowin Filter Test
 

  Scenario: User filter State and City
  Given  user Lounch Url
  And  user Scroll Down To Search Url
  When user Filter "Tamil Nadu" in state Search Bar 
  And user Filter "Chennai" in city Search Bar 
  Then user Click Search Button
  
  
  Scenario: User Can see 18+ is in Age Filter or  not
 	When  user Get All List In Age Filter
 	And user Check "18+"is in the Age list or not
 	Then print given Value In The Age List
  
    
  Scenario: User Can see Does1 is in  Dose Filter or Not
  When  user Get All List In Does Filter
 	And user Check "Does1" is in the Dose list or not
 	Then print given Value In The Dose List
  
  Scenario: User Can see free is in  Cost Filter or Not
  When  user Get All List In Cost Filter
 	And user Check "Free" is in the Cost list or not
 	Then print given Value In The Cost List
  
  Scenario: User Can see Covishield is in Vaccine Filter or Not
  When  user Get All List In Vaccine Filter
 	And user Check "Covishield" is in the Vaccine  list or not
 	Then print given Value In The Vaccine List
  
  Scenario: User cheack the result page count if the count less then one click paid option in filter
  
  
  Scenario: User Can see all selected value is Displayed in Showing results for suggestion
  
  
  Scenario: User Can get Vaccine addresss in the list