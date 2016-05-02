time(1,breakfast).
time(2,work).
time(3,lunch).
time(4,work2).
time(5,dinner).
time(6,rest).

like(breakfast,chinesefood).
like(work,tea).
like(work2,coffee).
like(lunch,japanese).
like(dinner,western).
like(rest,watchtv).

menu(chinesefood,dry_fried_rice).
menu(chinesefood,dry_fried_noodles).
menu(chinesefood,dumplings).
menu(chinesefood,spring_roll).
menu(chinesefood,beff_noodles).
menu(tea,greentea).
menu(tea,blacktea).
menu(tea,milktea).
menu(western,hamburger).
menu(western,fried_chicken).
menu(western,sandwich).
menu(japanese,sushi).
menu(japanese,sashimi).
menu(japanese,ramen).
menu(japanese,donburi).
menu(watchtv,hbo).
menu(watchtv,tvbs).
menu(watchtv,star_movie).
menu(coffee,espresso).
menu(coffee,cappuccino).
menu(coffee,latte).


now(T,L):-time(T,D),like(D,L).





