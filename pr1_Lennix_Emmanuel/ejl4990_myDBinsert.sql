-- Class:		CSE 3330
-- Semester:		Spring 2016
-- Student Name:	Lennix,Emmanuel,ejl4990
-- Student ID:		1001104990
-- Assignment:		project #1




INSERT INTO PlaneType VALUES ('MD','MD11',600,180 );
INSERT INTO PlaneType VALUES ('MD','SUPER80',500,170 );
INSERT INTO PlaneType VALUES ('BOEING','727',510,160 );
INSERT INTO PlaneType VALUES ('BOEING','757',650,160 );
INSERT INTO PlaneType VALUES ('AIRBUS','A300',620,150 );
INSERT INTO PlaneType VALUES ('AIRBUS','A320',700,180 );
SELECT * FROM PlaneType;

INSERT INTO PlaneSeats VALUES('MD',"MD11","F",20);
INSERT INTO PlaneSeats VALUES('MD',"MD11","E",150);
INSERT INTO PlaneSeats VALUES('MD',"SUPER80","F",10);
INSERT INTO PlaneSeats VALUES('MD',"SUPER80","E",90);
INSERT INTO PlaneSeats VALUES('BOEING',"727","F",10);
INSERT INTO PlaneSeats VALUES('BOEING',"727","E",110);
INSERT INTO PlaneSeats VALUES('BOEING',"757","F",20);
INSERT INTO PlaneSeats VALUES('BOEING',"757","E",160);
INSERT INTO PlaneSeats VALUES('AIRBUS',"A300","F",20);
INSERT INTO PlaneSeats VALUES('AIRBUS',"A300","E",160);
INSERT INTO PlaneSeats VALUES('AIRBUS',"A320","F",30);
INSERT INTO PlaneSeats VALUES('AIRBUS',"A320","E",200);
SELECT * FROM PlaneSeats;





INSERT INTO Airport VALUES( 'DFW','Dallas','TX'     );
INSERT INTO Airport VALUES( 'LOG','Boston','MA'     );
INSERT INTO Airport VALUES( 'ORD','Chicago','IL'    );
INSERT INTO Airport VALUES( 'MDW','Chicago','IL'    );
INSERT INTO Airport VALUES( 'JFK','New York','NY'   );
INSERT INTO Airport VALUES( 'LGA','New York','NY'   );
INSERT INTO Airport VALUES( 'INT','Houston','TX'    );
INSERT INTO Airport VALUES( 'LAX','Los Angeles','CA');
SELECT * FROM Airport;



INSERT INTO Plane VALUES (1,'MD','MD11','2010-9-3','DFW');
INSERT INTO Plane VALUES (2,'MD','MD11','2010-9-4','MDW');
INSERT INTO Plane VALUES (3,'MD','SUPER80','2010-9-1','LAX');
INSERT INTO Plane VALUES (4,'MD','SUPER80','2010-9-3','ORD');
INSERT INTO Plane VALUES (5,'MD','SUPER80','2010-9-6','LGA');
INSERT INTO Plane VALUES (6,'BOEING','727','2010-9-1','DFW');
INSERT INTO Plane VALUES (7,'BOEING','757','2010-10-2','LAX');
INSERT INTO Plane VALUES (8,'AIRBUS','A300','2008-9-1','INT');
INSERT INTO Plane VALUES (9,'AIRBUS','A320','2009-9-4','LOG');
SELECT * FROM Plane;



INSERT INTO Flight VALUES( 1000,"Bistro","Y");
INSERT INTO Flight VALUES(1010,"Meal","N");
INSERT INTO Flight VALUES(1020,"Meal","Y");
INSERT INTO Flight VALUES(1030,"Snack","N");
INSERT INTO Flight VALUES(1040,"Meal","N");
INSERT INTO Flight VALUES(10150,"Cold Drink","Y");
INSERT INTO Flight VALUES(10160,"Hot Drink","Y");
SELECT * FROM Flight;


INSERT INTO FlightInstance VALUES (1000,'2015-10-5' );
INSERT INTO FlightInstance VALUES (1000,'2015-10-6' );
INSERT INTO FlightInstance VALUES (1000,'2015-10-7' );
INSERT INTO FlightInstance VALUES (1010,'2015-10-5' );
INSERT INTO FlightInstance VALUES (1010,'2015-10-6' );
INSERT INTO FlightInstance VALUES (1020,'2015-10-5' );
INSERT INTO FlightInstance VALUES (1030,'2015-10-5' );
INSERT INTO FlightInstance VALUES (1040,'2015-10-7' );
INSERT INTO FlightInstance VALUES (1030,'2015-10-5' );
INSERT INTO FlightInstance VALUES (1040,'2015-10-7' );
SELECT * FROM FlightInstance;


INSERT INTO Passenger VALUES (1,"Jones","(972)999-1111");
INSERT INTO Passenger VALUES (2,"James","(214)111-9999");
INSERT INTO Passenger VALUES (3,"Henry","(214)222-1111");
INSERT INTO Passenger VALUES (4,"Luis","(972)111-3333");
INSERT INTO Passenger VALUES (5,"Howard","(972)333-1111");
INSERT INTO Passenger VALUES (6,"Frank","(214)111-5555");
INSERT INTO Passenger VALUES (7,"Frankel","(972)111-2222");
INSERT INTO Passenger VALUES (8,"Bushnell","(214)111-4444");
INSERT INTO Passenger VALUES (9,"Camden","(214)222-5555");
INSERT INTO Passenger VALUES (10,"Max","(972)444-1111");
INSERT INTO Passenger VALUES (11,"Flores","(214)333-6666");
INSERT INTO Passenger VALUES (12,"Clinton","(214)222-5555");
INSERT INTO Passenger VALUES (13,"Jeams","(817)999-1111");
INSERT INTO Passenger VALUES (14,"sarah","(817)277-1212");
SELECT * FROM Passenger;


INSERT INTO Pilot VALUES (1,"Jones",'1990-05-10');
INSERT INTO Pilot VALUES (2,"Adams",'1990-06-01');
INSERT INTO Pilot VALUES (3,"Walker",'1991-07-02');
INSERT INTO Pilot VALUES (4,"Flores",'1992-04-01');
INSERT INTO Pilot VALUES (5,"Thompson",'1992-04-10');
INSERT INTO Pilot VALUES (6,"Dean",'1993-09-02');
INSERT INTO Pilot VALUES (7,"Carter",'1994-08-01');
INSERT INTO Pilot VALUES (8,"Mango",'1995-05-02');
INSERT INTO Pilot VALUES (9,"Cris",'1977-11-12');
INSERT INTO Pilot VALUES (10,"Bradly",'1990-09-07');
SELECT * FROM Pilot;


INSERT INTO FlightLeg VALUES (1000,1,"DFW","LOG",'2015-1-1 10:20','2015-1-1 13:40',7);
INSERT INTO FlightLeg VALUES (1010,1,"LAX","ORD",'2015-1-1 13:10','2015-1-1 16:20',3);
INSERT INTO FlightLeg VALUES (1010,2,"ORD","JFK",'2015-1-1 17:10','2015-1-1 20:20',3);
INSERT INTO FlightLeg VALUES (1020,1,"LOG","JFK",'2015-1-1 5:40','2015-1-1 6:20',9);
INSERT INTO FlightLeg VALUES (1020,2,"JFK","DFW",'2015-1-1 7:20','2015-1-1 10:20',9);
INSERT INTO FlightLeg VALUES (1020,3,"DFW","INT",'2015-1-1 11:10','2015-1-1 11:40',7);
INSERT INTO FlightLeg VALUES (1020,4,"INT","LAX",'2015-1-1 12:20','2015-1-1 15:10',7);
INSERT INTO FlightLeg VALUES (1030,1,"LAX","INT",'2015-1-1 11:20','2015-1-1 16:10',6);
INSERT INTO FlightLeg VALUES (1030,2,"INT","DFW",'2015-1-1 17:20','2015-1-1 18:00',6);
INSERT INTO FlightLeg VALUES (1040,1,"LAX","LGA",'2005-01-01 15:30','2015-01-01 21:00',1);
SELECT * FROM FlightLeg;



INSERT INTO FlightLegInstance VALUES(1,1000,'2015-10-5','2015-1-1 10:10','2015-1-1 13:10',3);
INSERT INTO FlightLegInstance VALUES(1,1000,'2015-10-6','2015-1-1 10:30','2015-1-1 14:20',8);
INSERT INTO FlightLegInstance VALUES(1,1010,'2015-10-5','2015-1-1 13:20','2015-1-1 17:10',1);
INSERT INTO FlightLegInstance VALUES(2,1010,'2015-10-5','2015-1-1 18:00','2015-1-1 21:00',1);
INSERT INTO FlightLegInstance VALUES(1,1010,'2015-10-6','2015-1-1 13:10','2015-1-1 16:10',3);
INSERT INTO FlightLegInstance VALUES(2,1010,'2015-10-6','2015-1-1 17:00','2015-1-1 20:30',6);
INSERT INTO FlightLegInstance VALUES(1,1020,'2015-10-5','2015-1-1 5:40','2015-1-1 6:30',5);
INSERT INTO FlightLegInstance VALUES(2,1020,'2015-10-5','2015-1-1 7:30','2015-1-1 10:40',5);
INSERT INTO FlightLegInstance VALUES(3,1020,'2015-10-5','2015-1-1 11:30','2015-1-1 12:20',5);
INSERT INTO FlightLegInstance VALUES(4,1020,'2015-10-5','2015-1-1 13:00','2015-1-1 16:00',2);
INSERT INTO FlightLegInstance VALUES(1,1030,'2015-10-5','2015-1-1 11:20','2015-1-1 16:10',8);
INSERT INTO FlightLegInstance VALUES(2,1030,'2015-10-5','2015-1-1 17:20','2015-1-1 18:40',8);
INSERT INTO FlightLegInstance VALUES(1,1000,'2015-10-7',NULL,NULL,NULL);
INSERT INTO FlightLegInstance VALUES(1,1040,'2015-10-7',NULL,NULL,NULL);
SELECT * FROM FlightLegInstance;



INSERT INTO Reservation VALUES(1,1000,'2015-10-5','DFW',"LOG",'E','2015-9-5',NULL);
INSERT INTO Reservation VALUES(1,1020,'2015-10-5','LOG',"JFK",'E','2015-9-14',NULL);
INSERT INTO Reservation VALUES(2,1020,'2015-10-5','LOG',"INT",'E','2015-9-4',NULL);
INSERT INTO Reservation VALUES(3,1020,'2015-10-5','JFK',"LAX",'E','2015-9-10',NULL);
INSERT INTO Reservation VALUES(4,1020,'2015-10-5','LOG',"LAX",'E','2015-9-10',NULL);
INSERT INTO Reservation VALUES(5,1020,'2015-10-5','LOG',"DFW",'F','2015-9-29',NULL);
INSERT INTO Reservation VALUES(6,1010,'2015-10-5','LAX',"JFK",'E','2015-9-19',NULL);
INSERT INTO Reservation VALUES(7,1010,'2015-10-5','LAX',"ORD",'E','2015-9-27',NULL);
INSERT INTO Reservation VALUES(8,1030,'2015-10-5','LAX',"DFW",'F','2015-10-5',NULL);
INSERT INTO Reservation VALUES(3,1010,'2015-10-5','LAX',"JFK",'E','2015-9-14',NULL);
INSERT INTO Reservation VALUES(9,1010,'2015-10-6','LAX',"JFK",'E','2015-9-9',NULL);
INSERT INTO Reservation VALUES(10,1010,'2015-10-6','ORD',"JFK",'E','2015-9-7','2015-9-19');
INSERT INTO Reservation VALUES(11,1000,'2015-10-6','DFW',"LOG",'E','20159-9',NULL);
INSERT INTO Reservation VALUES(12,1000,'2015-10-6','DFW',"LOG",'E','2015-9-19',NULL);
INSERT INTO Reservation VALUES(1,1010,'2015-10-6','ORD',"JFK",'E','2015-9-15',NULL);
INSERT INTO Reservation VALUES(1,1040,'2015-10-7','LAX','LGA','E','2015-10-1',NULL);
SELECT * FROM Reservation;

