use test;
CREATE TABLE mobile_number (
  cellular_number VARCHAR(10) PRIMARY KEY,
  consumer_name VARCHAR(30) NOT NULL,
  registered_state varchar(10) NOT NULL,
  is_internet_banking_enabled BOOLEAN NOT NULL,
);

use test;
CREATE TABLE credit_card (
  credit_card_number VARCHAR(16) PRIMARY KEY,
  credit_limit DOUBLE NOT NULL,
  credit_card_holder_name varchar(30) NOT NULL,
  expiry_date DATE NOT NULL,
  cvv INTEGER NOT NULL,
  cellular_number VARCHAR(10),
  CONSTRAINT fk_customer FOREIGN KEY (cellular_number)  
  REFERENCES mobile_number(cellular_number)  
  ON DELETE CASCADE  
  ON UPDATE CASCADE
);