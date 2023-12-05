use scuola;
select a.Cognome AS Alunno, c.Nome AS Corso from alunno a
inner join iscrizione isc on a.IdAlunno = isc.XidAlunno
inner join corso c on isc.XidCorso = c.IdCorso
where isc.`1Rata` = 'No';