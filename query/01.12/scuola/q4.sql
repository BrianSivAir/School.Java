use scuola;
select a.IdAlunno, a.Cognome, a.Nome from corso c
join iscrizione i on c.IdCorso = i.XidCorso
join alunno a on i.XidAlunno = a.IdAlunno;