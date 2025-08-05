Feature: Login Funtionality Testing	

	Scenario:
		Given Browser has launched
		When the app url enters it has to open
		Then if user enters valid username "Admin "
		And if user enters valid password "admin123"
		And if user clicks on login button
		Then homepage shoud be displayed
		Then close the bowser

	Scenario Outline: Testing login with different data
		Given Browser has launched
		When the app url enters it has to open
		Then if user enters username "<username>"
		And if user enters password "<password>"
		And if user clicks on login button
		Then homepage shoud not be displayed
		Then close the bowser
		
		Examples:
		 	| username | password |
		 	| Admin1   | admin123 |
		 	| Admin    | admin13  |
		 	| Admin1   | admin13  |
		 	|          |          |