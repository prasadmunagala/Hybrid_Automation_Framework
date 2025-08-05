	Feature: login functionality testing
		Scenario Outline: testing login with different data
			Given: browser has launched
			When: the app url enters it has to open
			Then: if user enters username "<username>"
			And: if user enters password "<password>"
			And: user clicks on login button
			Then: home page will be displayed

			Examples:
			 |username|password|
			 |Admin   |admin123|
			 |admin   |admin123|
			 |Admin   |admin342|
			 |admin3  |admin435|
			 |        |        |
			   
			




