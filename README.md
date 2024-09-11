![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)

# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:

* s371426, s371426@oslomet.no

## Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:

* s371426 har hatt hovedansvar for oppgave 1-5, 7.


## Oppgavebeskrivelser

### Oppgave 1

I oppgave 1 gikk vi frem ved å...

Teori spørsmål:

a) Det vil gjøres n-1 sammenligninger da man sammenligner to og to verdier. 
Den nte gang ville ha sammenlignet den siste med out of bounds.

b) Det blir færrest ombyttninger når tabellen allerede er stigene, eller sortert. Altså når når alle verdier er større 
enn den som er forran Altså eks. [1, 2, 3, 4, 4, 5, 6]

c) Det blir flest ombyttninger når den største verdien er først. Altå at ombyttningen må skje hver eneste sammenligning.

d) 

### Oppgave 2

I oppgave 2 gikk jeg frem ved å lage en loop som sjekker om en verdi i et array er mindre en det forran, hvis det er 
det i ett tilfelle, betyr det at arrayet ikke er sortert og feilmelding blir kastet. Teller også hvor mange ganger et 
tall er større en det forran da det er antall unike tall i arrayet. Hvis man starter med 1 som start verdi.
Lar også være å gjøre noe hvis arrayet er lengde 0 (mindre enn 1) da dat er det null unike tall.

### Oppgave 3

I oppgave 3 gikk jeg frem ved å ha to starte på maks unike tall. Alstå lengden på arrayet. Derretter ha 2 arrays 
innihverandre der den yttereste looper gjennom ett og ett ellement. Den innerste Starter på den første index +1 og går 
gjennom tabellen til slutt. For hvert steg sjekkes det om tallet på de to plassene er like, hvis det er det, så trekkes 
en fra antall unike tall og breaker inre loop. Den sjekker altså om det eksisterer et tall senere som er likt. Fordi den 
breaker slipper man at den teller samme flere ganger, og bittelitt raskere da den ikke trenger å sjekke alle hver gang.

I worst case vil den egentlig være O(n*(n/2)), men det kaller man fortsatt O(n^2), mens best case hvor alle er like 
vil den være O(n).

### Oppgave 4

I oppgave 4 gikk jeg frem ved å først gjøre en partisjonering av arrayet mellom odde og partall. Der den ene er til 
høyre og andre til venstre. Derreter kjøres quicksort på de to delene rekursivt intill de er sortert. Quicksort er 
egentlig partisjonering om og om igjen med 3 deler der den tredje er pivot. Min kode velger pivot at random slik at 
worst case med O(n^2) skjer mye mindre sannsynelig at skjer og det heller er nermere O(n*log(n)).

Hadde flere små bugs som indeks feil, <= som skulle være <, og feil med stop condition jeg måtte fikse underveis.

### Oppgave 5

I oppgave 5 gikk jeg frem ved å lage en funksjon som som går lagrer siste element i variabel, så går 
baklengs gjennom arrayet å flytter en framover. Til slutt plasseres den siste tilbake i plass 0.
Grunnen til at den går baklengs er da trenger man bare å lagre til variabelen en gang istedenfor hver eneste gang.

### Oppgave 7

I oppgave 7a gikk jeg frem ved å konvertere strengene til Char array. Opprette en char array som er lengden til begge.
Derreter looper gjennom og plasserer de annenhver til outputarray. Derreter konverterer det til string for return.

I oppgave 7b er inputten et array med strings istenfor 2 strings. Det hadde vært mere tungvindt å konvertere til char 
array, så fant en annen metode med .charAt() istedenfor. En ytre while loop som går gjennom possisjon til bokstaver, 
og som går intill den indre ikke lenger legger noe til i output. Den indre er en for each som går gjennom hvert ord.
Med en if for å forhindre at den prøver å hente ut en bokstav som ikke eksisterer. Brukt stringbuilder isstedenfor 
output array som konverteres.


Koden til 7b er bedre da den også kan ta i mot bare 2 strings. Så koden til 7a trengs egentlig ikke lenger, 
men lar den stå.