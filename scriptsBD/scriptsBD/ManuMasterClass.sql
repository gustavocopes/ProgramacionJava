/* 
1. Obtener los datos completos de los empleados.*/
select * from empleados;/*
2. Obtener los datos completos de los departamentos.*/
select * from departamentos;/*
3. Listar el nombre de los departamentos.*/
select nombre_depto from departamentos;/*
4. Obtener el nombre y salario de todos los empleados.*/
select nombre, sal_emp from empleados;/*
5. Listar todas las comisiones.*/
select comision_emp ;/*
6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.*/
select * from empleados where cargo_emp = 'Secretaria';/*
7. Obtener los datos de los empleados vendedores, ordenados por nombre
alfabéticamente.*/
select * from empleados where cargo_emp = 'vendedores' order by nombre;/*
8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor.
*/
select nombre, cargo_emp from empleados order by sal_emp ;/*

9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
de “Ciudad Real”
	SELECT * FROM departamentos WHERE ciudad = 'CIUDAD REAL'; 

10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados.
	SELECT nombre AS "Nombre", cargo_emp AS "Cargo" 
	FROM empleados; 

11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.
	SELECT sal_emp, comision_emp, id_depto
	FROM empleados
	WHERE id_depto = 2000
	ORDER BY comision_emp; 

12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético.
	SELECT nombre, sal_emp, comision_emp, (sal_emp+comision_emp+500) AS "Total"
	ROM empleados
	WHERE id_depto = 3000
	ORDER BY nombre; 

13. Muestra los empleados cuyo nombre empiece con la letra J.
	SELECT nombre
	FROM empleados
	WHERE nombre
	LIKE 'j%'; 

14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.
	SELECT nombre, comision_emp, sal_emp, (comision_emp + sal_emp) AS "Total" 
	FROM empleados
	WHERE comision_emp > 1000; 
    
15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.
	SELECT nombre, comision_emp, sal_emp, (comision_emp + sal_emp) AS "Total" 
	FROM empleados
	WHERE comision_emp = 0 ; // puede ser null :) 


16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
	SELECT nombre, comision_emp, sal_emp
	FROM empleados
	WHERE comision_emp > sal_emp; 

17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
	SELECT nombre, comision_emp, sal_emp
	FROM empleados
	WHERE comision_emp <= (sal_emp * 0.3); 

18. Hallar los empleados cuyo nombre no contiene la cadena “MA” y oredenar alfabeticamente.
	SELECT nombre
	FROM empleados
	WHERE nombre NOT LIKE '%ma%' ORDER BY nombre; 


19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento.
	SELECT *
	FROM departamentos
	WHERE nombre_depto IN ("Ventas", "Investigación", "Mantenimiento"); 

20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.
	SELECT *
	FROM departamentos
	WHERE nombre_depto NOT IN ("Ventas", "Investigación", "Mantenimiento"); 
	
21. Mostrar el salario más alto de la empresa.
	SELECT nombre, sal_emp FROM empleados
	WHERE sal_emp = (SELECT MAX(sal_emp) FROM empleados);
	
22. Mostrar el nombre del último empleado de la lista por orden alfabético.
	SELECT nombre
	FROM empleados
	ORDER BY nombre DESC LIMIT 1;

23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
	SELECT 
	MAX(sal_emp) AS "MAX",
	MIN(sal_emp) AS "MIN",
	(MAX(sal_emp) - MIN(sal_emp) ) AS "DIFEREN"
	FROM empleados;

24. Hallar el salario promedio por departamento.
	SELECT AVG(sal_emp), id_depto
	FROM empleados
	GROUP BY id_depto ;


Consultas con Having----
25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.
	SELECT COUNT(*), id_depto
	FROM empleados
	GROUP BY id_depto HAVING COUNT(*)>3;

26. Hallar los departamentos que no tienen empleados
	SELECT COUNT(*), id_depto
	FROM empleados
	GROUP BY id_depto HAVING COUNT(*)=0;
    
Consulta con Subconsulta-----
28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.
	SELECT nombre, sal_emp
	FROM empleados
	WHERE sal_emp >= (SELECT AVG(sal_emp) FROM empleados)
	ORDER BY id_depto;
	
*/
