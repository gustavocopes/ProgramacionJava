-- Devuelve una lista con el código del producto, nombre del producto, código del fabricante
-- y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo, p.nombre,f.codig, f.nombre from producto p, fabricante f;
-- Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
-- los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético.
select p.nombre, p.precio, f.nombre from producto p, fabricante f order by f.nombre asc;
-- Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
-- más barato.
select p.nombre, p.precio, f.nombre from producto p, fabricante f order by p.precio asc limit 1;
-- Devuelve una lista de todos los productos del fabricante Lenovo.
select p.nombre, f.nombre from producto p inner join fabricante f on f.nombre = 'lenovo'; 
-- Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
-- mayor que $200.
select p.nombre, f.nombre, precio from producto p,fabricante f where f.nombre = 'Crucial' and precio>200;
-- Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
-- Utilizando el operador IN.
select p.nombre, f.nombre from producto p,fabricante f where f.nombre in ('Asus','Hewlett-Packard');
-- Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
-- los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
-- ascendente)
select p.nombre, p.precio, f.nombre from producto p,fabricante f where 
precio>=180 order by precio asc, f.nombre desc; 

-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
-- productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
SELECT f.nombre, p.nombre from fabricante f left join producto p on p.codigo_fabricante = f.codigo;

-- Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
-- producto asociado.
select f.nombre, p.nombre from fabricante f left join producto p on p.codigo_fabricante = f.codigo where p.codigo_fabricante IS NULL;

-- Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
select p.nombre, f.nombre from producto p,fabricante f where f.nombre = 'lenovo';

-- Devuelve todos los datos de los productos que tienen el mismo precio que el producto
-- más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
