use scuola;
select a.Cognome AS Alunno, c.Nome AS Corso from alunno a
inner join iscrizione isc on a.IdAlunno = isc.XidAlunno
inner join corso c on isc.XidCorso = c.IdCorso
inner join insegnante ins on c.XidInsegnante = ins.IdInsegnante
where ins.Cognome = 'Stiavell';