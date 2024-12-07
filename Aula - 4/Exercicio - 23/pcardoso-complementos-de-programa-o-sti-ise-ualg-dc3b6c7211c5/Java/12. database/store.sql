BEGIN TRANSACTION;



CREATE TABLE Client (
	ClientId	INTEGER PRIMARY KEY AUTOINCREMENT,
	ClientName	TEXT NOT NULL,
	ClientAdress	TEXT NOT NULL
);

CREATE TABLE Product (
	ProductId	INTEGER PRIMARY KEY AUTOINCREMENT,
	ProductName	TEXT NOT NULL,
	ProductPrice	REAL NOT NULL,
	ProductStock	REAL NOT NULL
);


CREATE TABLE Orders (
	OrderId		INTEGER PRIMARY KEY AUTOINCREMENT,
	ClientId	INTEGER NOT NULL,
	OrderDate	TEXT NOT NULL,
	FOREIGN KEY(ClientId) REFERENCES Client(ClientId)
);


CREATE TABLE Details (
	OrderId		INTEGER NOT NULL,
	ProductId	INTEGER NOT NULL,
	Quantity	REAL NOT NULL,
	Price		REAL NOT NULL,
	FOREIGN KEY(OrderId) REFERENCES Orders(OrderId),
	FOREIGN KEY(ProductId) REFERENCES Product(ProductId),
	PRIMARY KEY (ProductId, OrderId)
);

INSERT INTO Client (ClientName, ClientAdress) 
VALUES 
  ('Joao ','Faro'),
  ('Margarida','Coimbra'),
  ('Claudia','Faro'),
  ('Pedro','Coimbra');

INSERT INTO Product (ProductName, ProductPrice, ProductStock)
VALUES
  ('Banana', 0.98, 48),
  ('Rice', 1.13, 102),
  ('Tomato', 1.45, 25);
  
INSERT INTO Orders (ClientId, OrderDate)
VALUES
  (1, '2016-05-02'),
  (3, '2016-05-02');
  
INSERT INTO Details (OrderId, ProductId, Quantity, Price)
VALUES
  (1, 1, 1, 0.96),
  (1, 2, 2, 1.3),
  (2, 2, 1, 1.3),
  (2, 3, 4, 1.42);

  
COMMIT;
