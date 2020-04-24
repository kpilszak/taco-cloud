delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient (id, name, type)
  values ('FLTO', 'wheat', 'WRAP');
insert into Ingredient (id, name, type)
  values ('COTO', 'maize', 'WRAP');
insert into Ingredient (id, name, type)
  values ('GRBF', 'ground beef', 'PROTEIN');
insert into Ingredient (id, name, type)
  values ('CARN', 'meat pieces', 'PROTEIN');
insert into Ingredient (id, name, type)
  values ('TMTO', 'diced tomatoes', 'VEGGIES');
insert into Ingredient (id, name, type)
  values ('LETC', 'lettuce', 'VEGGIES');
insert into Ingredient (id, name, type)
  values ('CHED', 'cheddar', 'CHEESE');
insert into Ingredient (id, name, type)
  values ('JACK', 'Monterey Jack', 'CHEESE');
insert into Ingredient (id, name, type)
  values ('SLSA', 'salsa', 'SAUCE');
insert into Ingredient (id, name, type)
  values ('SRCR', 'sour cream', 'SAUCE');