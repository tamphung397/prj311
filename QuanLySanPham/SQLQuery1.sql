Delete from Supplier
where id = '12'

select s.name from item i, Supplier s
where i.supplierId = s.id


			select  i.id, i.name,i.price,s.name as 'Name of supplier'
			from Supplier s, item i
			where s.id = i.supplierId


			select id, name, price ,name as 'Name of supplier'
			from item

			insert into item values(666,'a',1,0);
			