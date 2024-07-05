create table ShoeServiceBuilder_Brand (
	brandId VARCHAR(75) not null primary key,
	name VARCHAR(75) null
);

create table ShoeServiceBuilder_Shoe (
	uuid_ VARCHAR(75) null,
	shoeId VARCHAR(75) not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	shoeModel VARCHAR(75) null,
	gender VARCHAR(75) null,
	size_ DOUBLE,
	price DOUBLE,
	brandId VARCHAR(75) null,
	typeId VARCHAR(75) null
);

create table ShoeServiceBuilder_Type (
	typeId VARCHAR(75) not null primary key,
	name VARCHAR(75) null
);