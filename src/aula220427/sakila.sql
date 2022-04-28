SELECT first_name, last_name FROM actor WHERE actor_id = 20;

SELECT 
    title, special_features
FROM
    film
WHERE
    length < 100 AND rating = 'PG-13';

use sakila;

SELECT 
    MAX(length) AS maior_filme,
    MIN(length) AS menor_filme,
    AVG(length) AS media_filme
FROM
    film
WHERE
    rating = 'PG-13';
    
SELECT 
    rating, MAX(length)
FROM
    film
GROUP BY rating;

SELECT 
    rating, COUNT(*)
FROM
    film
GROUP BY rating;

SELECT 
    f.title, COUNT(*)
FROM
    film f,
    film_actor fa
WHERE
    f.film_id = fa.film_id
GROUP BY f.title
HAVING COUNT(*) >= 10;

SELECT 
    rating, rental_duration, COUNT(*)
FROM
    film
GROUP BY rating , rental_duration;

SELECT 
    title, name
FROM
    film,
    language
WHERE
    film.language_id = language.language_id;

SELECT 
    film.title, language.name
FROM
    film
        JOIN
    language ON film.language_id = language.language_id;
    
SELECT 
    f.title,
    l1.name AS idioma,
    l2.language_id AS 'idioma original'
FROM
    film f
        JOIN
    language l1 ON f.language_id = l1.language_id
        JOIN
    language l2 ON f.original_language_id = l2.language_id;

SELECT DISTINCT
    name
FROM
    film,
    language
WHERE
    film.language_id = language.language_id
        AND language.name != 'English';

SELECT 
    *
FROM
    film
WHERE
    title LIKE '%Notting%';
    
SELECT 
    (length / rental_duration) * 2 AS meu_calculo
FROM
    film;