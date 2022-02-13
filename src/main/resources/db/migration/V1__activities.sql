CREATE TABLE IF NOT EXISTS activities
(
  id              INT auto_increment PRIMARY KEY,
  start_time      TIMESTAMP,
  activity_desc   VARCHAR(100),
  activity_type   VARCHAR(10)
);