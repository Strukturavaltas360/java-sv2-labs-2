CREATE TABLE IF NOT EXISTS track_point
(
  id              INT auto_increment PRIMARY KEY,
  `time`          DATE,
  lat             NUMERIC(10,5),
  lon             NUMERIC(10,5),
  activities_id   INT,
  CONSTRAINT FOREIGN KEY (activities_id) REFERENCES activities (id)
);
