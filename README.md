# Task2 HomeWork - Travel Agency System

Class with Main Method - TravelAgency.java

### Main method output

```
Manager Address :Address{street='26 grove st', city='Boston', state='MA', zipcode='01233', country='USA'}
Manager Details :Employee Details: Employee{employeeId=1, departmentNumber=1, salary=120000}
Employee Address :Address{street='12 robert st', city='Hartford', state='CT', zipcode='34343', country='USA'}
Employee 1 Details :Employee Details: Employee{employeeId=101, departmentNumber=2, salary=50000}
Employee 2 Details :Employee Details: Employee{employeeId=102, departmentNumber=2, salary=40000}
Employee 3 Details :Employee Details: Employee{employeeId=103, departmentNumber=2, salary=48000}
---------------
Customer Address :Address{street='123 main st', city='New York', state='NY', zipcode='15632', country='USA'}
Customer 1 Details :Customer Details :Customer{customerId=1, phoneNumber='123-456-7890', emailAddress='customer1@test.com'}
Customer 2 Details :Customer Details :Customer{customerId=2, phoneNumber='987-654-4321', emailAddress='customer2@test.com'}
---------------
Payment{ paymentMethod=CreditCard, confirmationNumber=c-1234, amount=178.9}
---------------
Hotel Address :Address{street='999 Boston st', city='Chicago', state='IL', zipcode='87343', country='USA'}
Checked in at Hotel Lobby. Room key issued.
Allowed into Hotel Room
Checked out of Hotel
Printing Hotel Details :Hotel{name='Marriot', address=Address{street='999 Boston st', city='Chicago', state='IL', zipcode='87343', country='USA'}, roomNumber='43B'}
Hotel reservation created
Hotel no.of Guests updated
Hotel Reservation Details:
reservationId='hr-8765', status='CONFIRMED', fromDate=Sat May 13 00:00:00 EDT 2023, toDate=Wed May 17 00:00:00 EDT 2023, amount=589.65
HotelReservation{roomType='Suite', noOfGuest=5, hotel=Hotel{name='Marriot', address=Address{street='999 Boston st', city='Chicago', state='IL', zipcode='87343', country='USA'}, roomNumber='43B'}, amenities='Swimming pool, gym'}
Hotel reservation cancelled
---------------
Car Driver Added
Car Driver Added
Car Driver Removed
Car reservation created
Car type updated
Car Reservation Details:
reservationId='cr-676334', status='CONFIRMED', fromDate=Sat May 13 00:00:00 EDT 2023, toDate=Wed May 17 00:00:00 EDT 2023, amount=400.5
CarReservation{carType='Sedan', drivers=[Customer{customerId=1, phoneNumber='123-456-7890', emailAddress='customer1@test.com'}], carDetails='7seaters'}
car reservation cancelled
Car Reservations equal ? true
---------------
Checked in at the Terminal. Boarding Pass issued.
Security check completed. Allowed inside Aircraft
Printing Flight Details :Flight{flightNumber='F0145', arrivalAirport='Logan International', destinationAirport='JFK', seatNumber='F26'}
passenger added
passenger added
passenger removed
Flight reservation created
Flight seat number updated
Flight Reservation Details:
reservationId='Fr-1388', status='CONFIRMED', fromDate=Fri May 12 00:00:00 EDT 2023, toDate=Wed May 17 00:00:00 EDT 2023, amount=800.0
FlightReservation{pnrNumber=1234567, flight=Flight{flightNumber='F0145', arrivalAirport='Logan International', destinationAirport='JFK', seatNumber='A35'}, passengers=[Customer{customerId=2, phoneNumber='987-654-4321', emailAddress='customer2@test.com'}]}
Flight reservation cancelled
---------------
Hotel reservation created
Car reservation created
Flight reservation created
Booking created
Booking Details :Booking{bookingId='b-3456', date=Thu Apr 27 12:25:58 EDT 2023, customer=Customer{customerId=1, phoneNumber='345-435-5869', emailAddress='customer1@test.com'}, reservations=[HotelReservation{roomType='Suite', noOfGuest=5, hotel=Hotel{name='Marriot', address=Address{street='999 Boston st', city='Chicago', state='IL', zipcode='87343', country='USA'}, roomNumber='43B'}, amenities='Swimming pool, gym'}, CarReservation{carType='Sedan', drivers=[Customer{customerId=1, phoneNumber='345-435-5869', emailAddress='customer1@test.com'}], carDetails='7seaters'}, FlightReservation{pnrNumber=1234567, flight=Flight{flightNumber='F0145', arrivalAirport='Logan International', destinationAirport='JFK', seatNumber='A35'}, passengers=[Customer{customerId=2, phoneNumber='987-654-4321', emailAddress='customer2@test.com'}]}], payment=com.solvd.travelagency.Payment@29453f44}
Hotel reservation cancelled
car reservation cancelled
Flight reservation cancelled
Booking cancelled
---------------
Employee 101 Salary updated to 60000
Employee{employeeId=1, departmentNumber=1, salary=120000}
Employee{employeeId=101, departmentNumber=2, salary=60000}
Employee{employeeId=102, departmentNumber=2, salary=40000}
Employee{employeeId=103, departmentNumber=2, salary=48000}
Customer{customerId=1, phoneNumber='345-435-5869', emailAddress='customer1@test.com'}
Customer{customerId=2, phoneNumber='987-654-4321', emailAddress='customer2@test.com'}
Booking{bookingId='b-3456', date=Thu Apr 27 12:25:58 EDT 2023, customer=Customer{customerId=1, phoneNumber='345-435-5869', emailAddress='customer1@test.com'}, reservations=[HotelReservation{roomType='Suite', noOfGuest=5, hotel=Hotel{name='Marriot', address=Address{street='999 Boston st', city='Chicago', state='IL', zipcode='87343', country='USA'}, roomNumber='43B'}, amenities='Swimming pool, gym'}, CarReservation{carType='Sedan', drivers=[Customer{customerId=1, phoneNumber='345-435-5869', emailAddress='customer1@test.com'}], carDetails='7seaters'}, FlightReservation{pnrNumber=1234567, flight=Flight{flightNumber='F0145', arrivalAirport='Logan International', destinationAirport='JFK', seatNumber='A35'}, passengers=[Customer{customerId=2, phoneNumber='987-654-4321', emailAddress='customer2@test.com'}]}], payment=com.solvd.travelagency.Payment@29453f44}
---------------
Inside static block in Status
Available Statuses :Status{BOOKED='BOOKED', CONFIRMED='CONFIRMED', CANCEL

```