package Twitter;

public class Order1 {

}
http://www.1point3acres.com/bbs/thread-208310-1-1.html
	
	SELECT
    Id,
    CASE 
        WHEN M IS NULL THEN 'Leaf'. visit 1point3acres.com for more.
        WHEN P_id IS NULL THEN 'Root'
        ELSE 'Inner'
    END AS TypeNode
FROM(
    SELECT
        DISTINCT hijo.*, padre.P_id as M
    FROM Tree hijo
    LEFT JOIN Tree padre ON(hijo.Id = padre.P_id)
)ORDER BY Id;