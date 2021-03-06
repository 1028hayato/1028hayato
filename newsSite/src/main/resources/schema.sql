create table if not exists users (
  userid int primary key AUTO_INCREMENT,
  username varchar(64) not null,
  password varchar(128) not null,
  enabled boolean not null,
  CONSTRAINT uq_username UNIQUE (username)
);

create table if not exists authorities (
  username varchar(64) not null,
  authority varchar(32) not null,
  PRIMARY KEY (username, authority)
);

create table if not exists groups (
  group_id int primary key AUTO_INCREMENT,
  grpname varchar(64) not null
);

create table if not exists group_members (
  group_id int,
  username varchar(64),
  FOREIGN KEY (group_id) REFERENCES groups (group_id),
  FOREIGN KEY (username) REFERENCES users (username),
  PRIMARY KEY (group_id, username)
);

create table if not exists articles (
	article_id int primary key AUTO_INCREMENT,
	title varchar(128) not null,
	description text not null
	);