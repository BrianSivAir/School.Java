select * from autisti a
inner join trasporti t on t.xidA = a.idA
group by a.cognome
having count(*)>2