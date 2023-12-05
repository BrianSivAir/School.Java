select t.idT, c.rs, a.cognome
from trasporti t
inner join clienti c on t.xidC = c.idC
inner join autisti a on t.xidA = a.idA
where t.data between '2015-1-03' and '2015-1-12'
