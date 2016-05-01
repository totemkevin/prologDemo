time(1,breakfast).
time(2,work).
time(3,lunch).
time(4,work).
time(5,dinner).
time(6,rest).
time(7,sleep).

like(breakfast,chinesefood).
like(work,coffee).
like(lunch,chinessfood).
like(dinner,western).
like(rest,watchtv).

now(T,L):-time(T,D),like(D,L).





