use scuola;
select c.IdCorso, c.Nome from corso c
inner join insegnante i on c.XidInsegnante = i.IdInsegnante
where Cognome = 'Rossetti';