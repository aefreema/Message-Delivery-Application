public class DHSInit {
    public DHSInit(){
	    //create DHS, start with 0 employees, employee constructor updates DHS employee count
	    DHS dhs = new DHS("Washington, DC", 0, "Jeh Johnson");
		
		//create departments
		Department d0 = new Department(dhs,"Washington, DC", "AO", "DMO", "Analysis and Operations");
		Department d1 = new Department(dhs,"Washington, DC", "CBP", "DMO", "Customs and Border Protection");
		Department d2 = new Department(dhs, "Washington, DC", "DMO", "DMO", "Departmental Management and Operations");
		Department d3 = new Department(dhs, "Washington, DC", "DNDO", "DMO", "Domestic Nuclear Detection Office");
		Department d4 = new Department(dhs, "Washington, DC", "ICE", "DMO", "U.S. Immigration and Customs Enforcement");
		Department d5 = new Department(dhs, "Washington, DC", "FEMA", "DMO", "Federal Emergency Management Agency");
		Department d6 = new Department(dhs, "Washington, DC", "FLETC", "DMO", "Federal Law Enforcement Training Center");
		Department d7 = new Department(dhs, "Washington, DC", "NPPD", "DMO", "National Protection and Programs Directorate");
		Department d8 = new Department(dhs, "Washington, DC","OHA", "DMO", "Office of Health Affairs");
		Department d9 = new Department(dhs, "Washington, DC","OIG", "DMO", "Office of Inspector General");
		Department d10 = new Department(dhs, "Washington, DC","ST", "DMO", "Science and Technology");
		Department d11 = new Department(dhs, "Washington, DC","TSA", "DMO", "Transportation Safety Administration");
		Department d12 = new Department(dhs, "Washington, DC","USCG", "DMO", "U.S. Coast Guard");
		Department d13 = new Department(dhs, "Washington, DC","USCIS", "DMO", "U.S. Citizenship and Immigration Services");
		Department d14 = new Department(dhs, "Washington, DC","USSS", "DMO", "U.S. Secret Service");
		
		//create facilities
		Facility f0 = new Facility(d3, "F234", "Charleston", "SC");
		Facility f1 = new Facility(d9, "F012", "New York", "NY");
		Facility f2 = new Facility(d11, "F453", "Cleveland", "OH");
		Facility f3 = new Facility(d5, "F800", "Atlanta", "GA");
		Facility f4 = new Facility(d13, "F345", "Phoenix", "AZ");
		Facility f5 = new Facility(d0,"F129", "Pittsburgh", "PA");
		Facility f6 = new Facility(d4, "F612", "Las Vegas", "NV");
		Facility f7 = new Facility(d3, "F501", "Portland", "OR");
		Facility f8 = new Facility(d14, "F412", "Denver", "CO");
		Facility f9 = new Facility(d10, "F079", "Chattanooga", "TN");
		Facility f10 = new Facility(d2, "F621", "Dallas", "TX");
		Facility f11 = new Facility(d6, "F399", "San Diego", "CA");
		Facility f12 = new Facility(d8,"F744", "Charlotte", "NC");
		Facility f13 = new Facility(d12, "F963", "Miami", "FL");
		Facility f14 = new Facility(d1, "F099", "Juneau", "AK");
		Facility f15 = new Facility(d11, "F245", "Chicago", "IL");
		Facility f16 = new Facility(d2, "F558", "Baton Rouge", "LA");
		Facility f17 = new Facility(d7, "F231", "Seattle", "WA");
		Facility f19 = new Facility(d14, "F743", "Boise", "ID");
		
		//give budgets to departments, budget numbers in thousands
		new AnnualBudget(d3, 2014, 512.6, 412.7, 377.0, 214.75); 
		new AnnualBudget(d0, 2014, 433.96, 56.3, 77.63, 100.0); 
		new AnnualBudget(d10, 2014, 963.23, 750.4, 589.63, 127.3); 
		new AnnualBudget(d7, 2014, 700.6, 586.45, 600.5, 362.8); 
		new AnnualBudget(d12, 2014, 589.63, 613.24, 478.96, 321.45); 
	    new AnnualBudget(d1, 2014, 637.37, 589.6, 23.4, 567.36); 
		new AnnualBudget(d5, 2014, 764.1, 451.6, 852.7, 95.36); 
		new AnnualBudget(d4, 2014, 456.3, 520.78, 964.3, 523.4); 
		new AnnualBudget(d9, 2014, 912.9, 253.6, 745.85, 52.0); 
		new AnnualBudget(d13, 2014, 486.6, 842.8, 268.8, 529.4); 
		new AnnualBudget(d11, 2014, 951.9, 357.7, 159.1, 624.6); 
		new AnnualBudget(d8, 2014, 321.1, 654.4, 987.7, 753.7); 
		new AnnualBudget(d11, 2013, 147.7, 789.7, 456.4, 123.1); 
		new AnnualBudget(d2, 2014, 852.8, 741.7, 369.9, 258.2); 
		new AnnualBudget(d14, 2014, 333.33, 478.0, 520.3, 963.0); 
		new AnnualBudget(d6, 2014, 258.45, 687.2, 58.79, 741.3); 
		
		//create Employees
		Employee e0 = new Employee(d0, f5, "12345", "Jan", "Doe", "Accountant", "E114");
		Employee e1 = new Employee(d1, f14, "Password", "Dylan", "Smith", "Director", "E136");
		new Employee(d2, f10, "54321", "Bob", "Fuller", "Facility Manager", "E095");
		new Employee(d3, f7, "0123", "Arthur", "Ortiz", "Intern", "E144");
		new Employee(d4, f6, "password", "Louis", "Martinez", "Trainer", "E160");
		new Employee(d5, f3, "testpass", "Jose", "Martinez", "Receptionist", "E200");
		new Employee(d6, f11, "secret", "Charlotte", "Webber", "Analyst", "E111");
		new Employee(d7, f17, "DHSemp", "Noah", "Brown", "Executive Assistant", "E163");
		Employee e2 = new Employee(d8, f12, "employee", "Jacob", "Fitzgerald", "Registered Nurse", "E078");
		Employee e3 = new Employee(d9, f1, "accountant", "Keith", "Hamilton", "Accountant", "E105");
		new Employee(d10, f9, "1234", "Suzy", "Kim", "Researcher", "E129");
		Employee e4 = new Employee(d11, f15, "employee4", "David", "Stewart", "Air Marshal", "E012");
		new Employee(d12, f13, "newEmp", "Robert", "Doe", "Officer", "E102");
		new Employee(d13, f4, "otherNew", "Ashley", "Whitfield", "Researcher", "E056");
		Employee e5 = new Employee(d14, f8, "5thEmp", "Esther", "Jenkins", "Intelligence Analyst", "E117");
		Employee e8 = new Employee(d0, f5, "paSSword", "Maria", "Ly", "Office Assistant", "E169");
		new Employee(d0, f5, "depMng", "Jacob", "Jones", "Departmental Manager", "E085");
		Employee e6 = new Employee(d4, f6, "65432", "Peter", "Williams", "Security Guard", "E100");
		new Employee(d5, f3, "EMTEmp", "Amber", "Penn", "EMT", "E014");
		new Employee(d6, f11, "testEmp", "Jasmine", "Cruz", "Secretary", "E113");
		Employee e7 = new Employee(d14, f11, "empe7", "Tiana", "Jones", "Manager", "E134");
		
		
		//create Reports
		Intelligence_Report r1 = new Intelligence_Report(d14, e5, "R33", "Possible counterfeiting ring in SW", true, "Smith, Jones", 7, "Counterfeiting", "Atlanta, GA", 9,
		                                                 "Several counterfeit bills traced back to the individual. Agents investigated the scope of the counterfeiting, found no other "
														 + "individuals involved. Small-scale operation with bills >= $20.");   
		Intelligence_Report r2 = new Intelligence_Report(d1, e1, "R102", "Illegal shipment to cross border", false, "Organization", 7, "Smuggling", "Los Angeles, CA", 4,
		                                                 "Intelligence reports indicate several shipments of cocaine to be shipped through the US-Mexico border. Shipment is expected to "
														  + "originate from Nogales, Mexico, and ship to Los Angeles, CA, United States. Intelligence reports originate from confidential "
														  + "federal informants from the Mérida Initiative.");    
		new Intelligence_Report(d12, e2, "R14", "Surveillance report on Domingo, A", false, "Domingo, Anna", 4, "Surveillance", "Chicago, IL", 3,
		                        "The individual is suspected of being in contact with wanted fugitives. No contact with the fugitives has been recorded, investigation ongoing.");  					
		new Metrics_Report(d9, e3, "R34", "Metrics for E105", true, e3.lName + ", " + e3.fName, 0 , 1);
		new Metrics_Report(d0, e0, "R17", "Metrics for E114", false, e0.lName + ", " + e0.fName, 6, 9);      
		new Metrics_Report(d0, e8, "R11", "Metrics for E169", false, e8.lName + ", " + e8.fName, 10, 10);
		Threat_Report r3 = new Threat_Report(d11, e4, "R30", "High levels of Chromium in NE waterways", true, "", "Chemical", "Factory runoff", "Annapolis, MD", "NE", 7,
		                                     "Local Maryland waterways tested positive for unsafe levels of chromium. Source found to be chemicals from factory runoff. Action being taken.");
		new Threat_Report(d14, e7, "R112", "Unauthorized access to online shopping database.", false, "Unknown", "Cyber", "Hacker", "Internet", "N/A", 3,
		                  "Online retailer, Amazon, reported unauthorized access to customer database on several occasions over the last week. Access to areas containing to confidential "
						  + "information. Security on retailers website has been upgraded, and monitering for further acess attempts.");
		new Threat_Report(d4, e6, "R41", "Online videos indicating possible terror attack.", false, "Smith, John", "Terror", "Individual", "Washington, DC", "E", 5,
		                  "Several online videos created by individual indicating possible terror attack to Pentagon. Individual under surveillance.");
		
		//create Alerts
		new Alert("A056", r1, "Counterfeiting Investigation", new boolean[]{false, true, false, false, true, false, false, false, false, false, false, false, true, true, true});
		new Alert("A01", r2, "Smuggling Investigation", new boolean[]{false, true, false, false, true, false, false, true, false, false, false, false, true, false, true});
		new Alert("A145", r3, "Chemical Threat", new boolean[]{false, false, false, false, true, true, false, true, false, false, true, true, true, true, true});
	}
}
