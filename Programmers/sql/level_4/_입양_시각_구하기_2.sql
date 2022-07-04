-- RECURISVE 로 0 ~ 23 시간 에 대한 COUNT 0 구하기
WITH RECURSIVE TEMP AS (
    SELECT 0 AS HOUR, 0 AS COUNT
    UNION ALL
    SELECT HOUR + 1, 0 FROM TEMP WHERE HOUR < 23
)

SELECT T.HOUR, IFNULL(T.COUNT + AO.COUNT, 0) AS COUNT
FROM TEMP T LEFT JOIN (
    SELECT HOUR(DATETIME) HOUR, COUNT(*) AS COUNT
    FROM ANIMAL_OUTS
    GROUP BY HOUR(DATETIME)) AO ON T.HOUR = AO.HOUR
ORDER BY T.HOUR