CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
									start_time TIMESTAMP,
									activity_desc VARCHAR(255),
									activity_type VARCHAR(255),
									PRIMARY KEY (id));

insert into activities(start_time, activity_desc, activity_type) values('2021-01-01 12:30:000', 'Running in the park','RUNNING');
insert into activities(start_time, activity_desc, activity_type) values('2021-01-01 13:30:000', 'Hiking in the park','HIKING');
insert into activities(start_time, activity_desc, activity_type) values('2021-01-01 14:30:000', 'Biking in the park','BIKING');