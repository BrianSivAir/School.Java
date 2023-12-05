-- Elencare tutte le partenze effettuate da Milano con un furgone indicando il peso del furgone espresso in tonnellate.

select idT, partenza, arrivo, t.peso / 1000 as peso, data, xidC, xidM, xidA
from trasporti t
inner join mezzi m on t.xidM = m.idM
where partenza = 'Milano'
and m.tipo = 'furgone'