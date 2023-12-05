use scuola;
select c.Nome AS Corso, ins.Cognome AS Insegnante from alunno a
inner join iscrizione isc on a.IdAlunno = isc.XidAlunno
inner join corso c on c.IdCorso = isc.XidCorso
inner join insegnante ins on c.XidInsegnante = ins.IdInsegnante
where a.Cognome = 'Picozzi';