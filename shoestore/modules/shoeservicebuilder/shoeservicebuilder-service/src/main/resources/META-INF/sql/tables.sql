create table ShoeServiceBuilder_Shoe (
	uuid_ VARCHAR(75) null,
	shoeId VARCHAR(75) not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	brandId VARCHAR(75) null,
	typeId VARCHAR(75) null,
	shoeModel VARCHAR(75) null,
	gender VARCHAR(75) null,
	size_ DOUBLE,
	price DOUBLE
);