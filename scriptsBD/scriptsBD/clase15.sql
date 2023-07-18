-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select Nombre from jugadores order by Nombre;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
select nombre, Peso from jugadores where Posicion = 'C' && Peso > 200 order by Nombre;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
select division from equipos where division = "east";
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select * from equipos where Ciudad like 'c%'order by nombre;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select nombre, nombre_equipo from jugadores order by Nombre_equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select nombre, Nombre_equipo from jugadores where Nombre_equipo = 'raptors';
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select puntos_por_partido from estadisticas where estadisticas.jugador = (select j.codigo from jugadores j where j.Nombre = 'Pau Gasol');
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select puntos_por_partido from estadisticas where estadisticas.jugador = (select j.codigo from jugadores j where j.Nombre = 'Pau Gasol') && estadisticas.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
select sum(puntos_por_partido) puntos, jugadores.Nombre from estadisticas join jugadores on estadisticas.jugador = jugadores.codigo group by jugador order by puntos;

-- 11. Mostrar el número de jugadores de cada equipo.
select Nombre_equipo, count(nombre) from jugadores group by Nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select sum(puntos_por_partido) puntos, jugadores.Nombre from estadisticas join jugadores on estadisticas.jugador = jugadores.codigo group by jugador order by puntos desc limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select equipos.nombre, conferencia, division, jugadores.Nombre from equipos join jugadores on  equipos.Nombre = jugadores.Nombre_equipo order by jugadores.Altura desc limit 1;
-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select substring(altura, 2, 1)  from jugadores order by altura desc;


select equipo_local, equipo_visitante, (puntos_local - puntos_visitante) diferencia from partidos where (puntos_local - puntos_visitante) = (select min(puntos_local - puntos_visitante) from partidos);
-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- equipo_ganador), en caso de empate sera null.

SELECT codigo, equipo_local, equipo_visitante,
       IF(puntos_local > puntos_visitante, equipo_local,
		IF(puntos_local < puntos_visitante, equipo_visitante, NULL)) AS equipo_ganador
FROM partidos;

SELECT codigo, equipo_local, equipo_visitante,
 CASE WHEN puntos_local > puntos_visitante THEN equipo_local WHEN puntos_local < puntos_visitante THEN equipo_visitante
 ELSE NULL END AS equipo_ganador FROM partidos;