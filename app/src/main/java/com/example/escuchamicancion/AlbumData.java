package com.example.escuchamicancion;

import java.util.ArrayList;
import java.util.Arrays;

public class AlbumData {

    public static ArrayList<Album> getAllAlbums() {
        ArrayList<Album> albums = new ArrayList<>();

        String[][] albumDetails = {
                // Álbumes de Rock
                // AC/DC
                {"Back in Black", "Hells Bells", "Shoot to Thrill", String.valueOf(R.raw.hells_bells), String.valueOf(R.raw.shoot_to_thrill), "AC/DC", "Rock", "back_in_black",
                        "1. Hells Bells\n2. Shoot to Thrill\n3. What Do You Do for Money Honey\n4. Given the Dog a Bone\n5. Let Me Put My Love into You\n6. Back in Black\n7. You Shook Me All Night Long\n8. Have a Drink on Me\n9. Shake a Leg\n10. Rock and Roll Ain't Noise Pollution"},
                {"Highway to Hell", "Highway to Hell", "Girls Got Rhythm", String.valueOf(R.raw.highway_to_hell), String.valueOf(R.raw.girls_got_rhythm), "AC/DC", "Rock", "highway_to_hell",
                        "1. Highway to Hell\n2. Girls Got Rhythm\n3. Walk All Over You\n4. Touch Too Much\n5. Beating Around the Bush\n6. Shot Down in Flames\n7. Get It Hot\n8. If You Want Blood (You've Got It)\n9. Love Hungry Man\n10. Night Prowler"},
                {"Let There Be Rock", "Let There Be Rock", "Whole Lotta Rosie", String.valueOf(R.raw.let_there_be_rock), String.valueOf(R.raw.whole_lotta_rosie), "AC/DC", "Rock", "let_there_be_rock",
                        "1. Go Down\n2. Dog Eat Dog\n3. Let There Be Rock\n4. Bad Boy Boogie\n5. Overdose\n6. Crabsody in Blue\n7. Hell Ain't a Bad Place to Be\n8. Whole Lotta Rosie"},
                {"Powerage", "Rock 'n' Roll Damnation", "Sin City", String.valueOf(R.raw.rock_n_roll_damnation), String.valueOf(R.raw.sin_city), "AC/DC", "Rock", "powerage",
                        "1. Rock 'n' Roll Damnation\n2. Down Payment Blues\n3. Gimme a Bullet\n4. Riff Raff\n5. Sin City\n6. What's Next to the Moon\n7. Gone Shootin'\n8. Up to My Neck in You\n9. Kicked in the Teeth"},

                // Nirvana
                {"Nevermind", "Smells Like Teen Spirit", "Come as You Are", String.valueOf(R.raw.smells_like_teen_spirit), String.valueOf(R.raw.come_as_you_are), "Nirvana", "Rock", "nevermind",
                        "1. Smells Like Teen Spirit\n2. In Bloom\n3. Come as You Are\n4. Breed\n5. Lithium\n6. Polly\n7. Territorial Pissings\n8. Drain You\n9. Lounge Act\n10. Stay Away\n11. On a Plain\n12. Something in the Way"},
                {"In Utero", "Heart-Shaped Box", "Rape Me", String.valueOf(R.raw.heart_shaped_box), String.valueOf(R.raw.rape_me), "Nirvana", "Rock", "in_utero",
                        "1. Serve the Servants\n2. Scentless Apprentice\n3. Heart-Shaped Box\n4. Rape Me\n5. Frances Farmer Will Have Her Revenge on Seattle\n6. Dumb\n7. Very Ape\n8. Milk It\n9. Pennyroyal Tea\n10. Radio Friendly Unit Shifter\n11. Tourette's\n12. All Apologies"},
                {"MTV Unplugged in New York", "About a Girl", "The Man Who Sold the World", String.valueOf(R.raw.about_a_girl), String.valueOf(R.raw.man_who_sold_the_world), "Nirvana", "Rock", "mtv_unplugged_in_new_york",
                        "1. About a Girl\n2. Come as You Are\n3. Jesus Doesn't Want Me for a Sunbeam\n4. The Man Who Sold the World\n5. Pennyroyal Tea\n6. Dumb\n7. Polly\n8. On a Plain\n9. Something in the Way\n10. Plateau\n11. Oh, Me\n12. Lake of Fire\n13. All Apologies\n14. Where Did You Sleep Last Night"},
                {"Bleach", "Love Buzz", "Negative Creep", String.valueOf(R.raw.love_buzz), String.valueOf(R.raw.negative_creep), "Nirvana", "Rock", "bleach",
                        "1. Blew\n2. Floyd the Barber\n3. About a Girl\n4. School\n5. Love Buzz\n6. Paper Cuts\n7. Negative Creep\n8. Scoff\n9. Swap Meet\n10. Mr. Moustache\n11. Sifting"},

                // Pink Floyd
                {"The Dark Side of the Moon", "Time", "Money", String.valueOf(R.raw.time), String.valueOf(R.raw.money), "Pink Floyd", "Rock", "the_dark_side_of_the_moon",
                        "1. Speak to Me\n2. Breathe\n3. On the Run\n4. Time\n5. The Great Gig in the Sky\n6. Money\n7. Us and Them\n8. Any Colour You Like\n9. Brain Damage\n10. Eclipse"},
                {"The Wall", "Another Brick in the Wall (Part 2)", "Comfortably Numb", String.valueOf(R.raw.another_brick), String.valueOf(R.raw.comfortably_numb), "Pink Floyd", "Rock", "the_wall",
                        "1. In the Flesh?\n2. The Thin Ice\n3. Another Brick in the Wall (Part 1)\n4. The Happiest Days of Our Lives\n5. Another Brick in the Wall (Part 2)\n6. Mother\n7. Goodbye Blue Sky\n8. Empty Spaces\n9. Young Lust\n10. One of My Turns\n11. Don't Leave Me Now\n12. Another Brick in the Wall (Part 3)\n13. Goodbye Cruel World\n14. Hey You\n15. Is There Anybody Out There?\n16. Nobody Home\n17. Vera\n18. Bring the Boys Back Home\n19. Comfortably Numb\n20. The Show Must Go On\n21. In the Flesh\n22. Run Like Hell\n23. Waiting for the Worms\n24. Stop\n25. The Trial\n26. Outside the Wall"},
                {"Wish You Were Here", "Wish You Were Here", "Shine On You Crazy Diamond", String.valueOf(R.raw.wish_you_were_here), String.valueOf(R.raw.shine_on), "Pink Floyd", "Rock", "wish_you_were_here",
                        "1. Shine On You Crazy Diamond (Parts I-V)\n2. Welcome to the Machine\n3. Have a Cigar\n4. Wish You Were Here\n5. Shine On You Crazy Diamond (Parts VI-IX)"},
                {"Animals", "Dogs", "Sheep", String.valueOf(R.raw.dogs), String.valueOf(R.raw.sheep), "Pink Floyd", "Rock", "animals",
                        "1. Pigs on the Wing (Part 1)\n2. Dogs\n3. Pigs (Three Different Ones)\n4. Sheep\n5. Pigs on the Wing (Part 2)"},

                // The Beatles
                {"Abbey Road", "Come Together", "Here Comes the Sun", String.valueOf(R.raw.come_together), String.valueOf(R.raw.here_comes_the_sun), "The Beatles", "Rock", "abbey_road",
                        "1. Come Together\n2. Something\n3. Maxwell's Silver Hammer\n4. Oh! Darling\n5. Octopus's Garden\n6. I Want You (She's So Heavy)\n7. Here Comes the Sun\n8. Because\n9. You Never Give Me Your Money\n10. Sun King\n11. Mean Mr. Mustard\n12. Polythene Pam\n13. She Came In Through the Bathroom Window\n14. Golden Slumbers\n15. Carry That Weight\n16. The End\n17. Her Majesty"},
                {"Sgt. Pepper's Lonely Hearts Club Band", "Lucy in the Sky with Diamonds", "A Day in the Life", String.valueOf(R.raw.lucy_in_the_sky), String.valueOf(R.raw.a_day_in_the_life), "The Beatles", "Rock", "sgt_peppers_lonely_hearts_club_band",
                        "1. Sgt. Pepper's Lonely Hearts Club Band\n2. With a Little Help from My Friends\n3. Lucy in the Sky with Diamonds\n4. Getting Better\n5. Fixing a Hole\n6. She's Leaving Home\n7. Being for the Benefit of Mr. Kite!\n8. Within You Without You\n9. When I'm Sixty-Four\n10. Lovely Rita\n11. Good Morning Good Morning\n12. Sgt. Pepper's Lonely Hearts Club Band (Reprise)\n13. A Day in the Life"},
                {"Revolver", "Eleanor Rigby", "Tomorrow Never Knows", String.valueOf(R.raw.eleanor_rigby), String.valueOf(R.raw.tomorrow_never_knows), "The Beatles", "Rock", "revolver",
                        "1. Taxman\n2. Eleanor Rigby\n3. I'm Only Sleeping\n4. Love You To\n5. Here, There and Everywhere\n6. Yellow Submarine\n7. She Said She Said\n8. Good Day Sunshine\n9. And Your Bird Can Sing\n10. For No One\n11. Doctor Robert\n12. I Want to Tell You\n13. Got to Get You into My Life\n14. Tomorrow Never Knows"},
                {"The White Album", "While My Guitar Gently Weeps", "Back in the U.S.S.R.", String.valueOf(R.raw.while_my_guitar), String.valueOf(R.raw.back_in_the_ussr), "The Beatles", "Rock", "the_white_album",
                        "1. Back in the U.S.S.R.\n2. Dear Prudence\n3. Glass Onion\n4. Ob-La-Di, Ob-La-Da\n5. Wild Honey Pie\n6. The Continuing Story of Bungalow Bill\n7. While My Guitar Gently Weeps\n8. Happiness Is a Warm Gun\n9. Martha My Dear\n10. I'm So Tired\n11. Blackbird\n12. Piggies\n13. Rocky Raccoon\n14. Don't Pass Me By\n15. Why Don't We Do It in the Road?\n16. I Will\n17. Julia\n18. Birthday\n19. Yer Blues\n20. Mother Nature's Son\n21. Everybody's Got Something to Hide Except Me and My Monkey\n22. Sexy Sadie\n23. Helter Skelter\n24. Long, Long, Long\n25. Revolution 1\n26. Honey Pie\n27. Savoy Truffle\n28. Cry Baby Cry\n29. Revolution 9\n30. Good Night"},

               // Álbumes de Pop
                // Michael Jackson
                {"Thriller", "Billie Jean", "Beat It", String.valueOf(R.raw.billie_jean), String.valueOf(R.raw.beat_it), "Michael Jackson", "Pop", "thriller",
                        "1. Wanna Be Startin' Somethin'\n2. Baby Be Mine\n3. The Girl Is Mine\n4. Thriller\n5. Beat It\n6. Billie Jean\n7. Human Nature\n8. P.Y.T. (Pretty Young Thing)\n9. The Lady in My Life"},
                {"Bad", "Smooth Criminal", "The Way You Make Me Feel", String.valueOf(R.raw.smooth_criminal), String.valueOf(R.raw.way_you_make_me_feel), "Michael Jackson", "Pop", "bad",
                        "1. Bad\n2. The Way You Make Me Feel\n3. Speed Demon\n4. Liberian Girl\n5. Just Good Friends\n6. Another Part of Me\n7. Man in the Mirror\n8. I Just Can't Stop Loving You\n9. Dirty Diana\n10. Smooth Criminal\n11. Leave Me Alone"},
                {"Dangerous", "Black or White", "Remember the Time", String.valueOf(R.raw.black_or_white), String.valueOf(R.raw.remember_the_time), "Michael Jackson", "Pop", "dangerous",
                        "1. Jam\n2. Why You Wanna Trip on Me\n3. In the Closet\n4. She Drives Me Wild\n5. Remember the Time\n6. Can't Let Her Get Away\n7. Heal the World\n8. Black or White\n9. Who Is It\n10. Give In to Me\n11. Will You Be There\n12. Keep the Faith\n13. Gone Too Soon\n14. Dangerous"},
                {"Off the Wall", "Don't Stop 'Til You Get Enough", "Rock with You", String.valueOf(R.raw.dont_stop_til_you_get_enough), String.valueOf(R.raw.rock_with_you), "Michael Jackson", "Pop", "off_the_wall",
                        "1. Don't Stop 'Til You Get Enough\n2. Rock with You\n3. Working Day and Night\n4. Get on the Floor\n5. Off the Wall\n6. Girlfriend\n7. She's Out of My Life\n8. I Can't Help It\n9. It's the Falling in Love\n10. Burn This Disco Out"},

                // Adele
                {"25", "Hello", "When We Were Young", String.valueOf(R.raw.hello), String.valueOf(R.raw.when_we_were_young), "Adele", "Pop", "a25",
                        "1. Hello\n2. Send My Love (To Your New Lover)\n3. I Miss You\n4. When We Were Young\n5. Remedy\n6. Water Under the Bridge\n7. River Lea\n8. Love in the Dark\n9. Million Years Ago\n10. All I Ask\n11. Sweetest Devotion"},
                {"21", "Rolling in the Deep", "Someone Like You", String.valueOf(R.raw.rolling_in_the_deep), String.valueOf(R.raw.someone_like_you), "Adele", "Pop", "a21",
                        "1. Rolling in the Deep\n2. Rumour Has It\n3. Turning Tables\n4. Don't You Remember\n5. Set Fire to the Rain\n6. He Won't Go\n7. Take It All\n8. I'll Be Waiting\n9. One and Only\n10. Lovesong\n11. Someone Like You"},
                {"19", "Chasing Pavements", "Hometown Glory", String.valueOf(R.raw.chasing_pavements), String.valueOf(R.raw.hometown_glory), "Adele", "Pop", "a19",
                        "1. Daydreamer\n2. Best for Last\n3. Chasing Pavements\n4. Cold Shoulder\n5. Crazy for You\n6. Melt My Heart to Stone\n7. First Love\n8. Right as Rain\n9. Make You Feel My Love\n10. My Same\n11. Tired\n12. Hometown Glory"},
                {"30", "Easy on Me", "Oh My God", String.valueOf(R.raw.easy_on_me), String.valueOf(R.raw.oh_my_god), "Adele", "Pop", "a30",
                        "1. Strangers by Nature\n2. Easy on Me\n3. My Little Love\n4. Cry Your Heart Out\n5. Oh My God\n6. Can I Get It\n7. I Drink Wine\n8. All Night Parking (with Erroll Garner) Interlude\n9. Woman Like Me\n10. Hold On\n11. To Be Loved\n12. Love Is a Game"},

                // Taylor Swift
                {"1989", "Shake It Off", "Blank Space", String.valueOf(R.raw.shake_it_off), String.valueOf(R.raw.blank_space), "Taylor Swift", "Pop", "a1989",
                        "1. Welcome to New York\n2. Blank Space\n3. Style\n4. Out of the Woods\n5. All You Had to Do Was Stay\n6. Shake It Off\n7. I Wish You Would\n8. Bad Blood\n9. Wildest Dreams\n10. How You Get the Girl\n11. This Love\n12. I Know Places\n13. Clean"},
                {"Red", "I Knew You Were Trouble", "We Are Never Ever Getting Back Together", String.valueOf(R.raw.i_knew_you_were_trouble), String.valueOf(R.raw.we_are_never_ever), "Taylor Swift", "Pop", "red",
                        "1. State of Grace\n2. Red\n3. Treacherous\n4. I Knew You Were Trouble\n5. All Too Well\n6. 22\n7. I Almost Do\n8. We Are Never Ever Getting Back Together\n9. Stay Stay Stay\n10. The Last Time\n11. Holy Ground\n12. Sad Beautiful Tragic\n13. The Lucky One\n14. Everything Has Changed\n15. Starlight\n16. Begin Again"},
                {"Fearless", "Love Story", "You Belong with Me", String.valueOf(R.raw.love_story), String.valueOf(R.raw.you_belong_with_me), "Taylor Swift", "Pop", "fearless",
                        "1. Fearless\n2. Fifteen\n3. Love Story\n4. Hey Stephen\n5. White Horse\n6. You Belong with Me\n7. Breathe\n8. Tell Me Why\n9. You're Not Sorry\n10. The Way I Loved You\n11. Forever & Always\n12. The Best Day\n13. Change"},
                {"Speak Now", "Mine", "Back to December", String.valueOf(R.raw.mine), String.valueOf(R.raw.back_to_december), "Taylor Swift", "Pop", "speak_now",
                        "1. Mine\n2. Sparks Fly\n3. Back to December\n4. Speak Now\n5. Dear John\n6. Mean\n7. The Story of Us\n8. Never Grow Up\n9. Enchanted\n10. Better Than Revenge\n11. Innocent\n12. Haunted\n13. Last Kiss\n14. Long Live"},

                // Madonna
                {"Like a Prayer", "Like a Prayer", "Express Yourself", String.valueOf(R.raw.like_a_prayer), String.valueOf(R.raw.express_yourself), "Madonna", "Pop", "like_a_prayer",
                        "1. Like a Prayer\n2. Express Yourself\n3. Love Song\n4. Till Death Do Us Part\n5. Promise to Try\n6. Cherish\n7. Dear Jessie\n8. Oh Father\n9. Keep It Together\n10. Spanish Eyes\n11. Act of Contrition"},
                {"True Blue", "Papa Don't Preach", "La Isla Bonita", String.valueOf(R.raw.papa_dont_preach), String.valueOf(R.raw.la_isla_bonita), "Madonna", "Pop", "true_blue",
                        "1. Papa Don't Preach\n2. Open Your Heart\n3. White Heat\n4. Live to Tell\n5. Where's the Party\n6. True Blue\n7. La Isla Bonita\n8. Jimmy Jimmy\n9. Love Makes the World Go Round"},
                {"Ray of Light", "Frozen", "Ray of Light", String.valueOf(R.raw.frozen), String.valueOf(R.raw.ray_of_light), "Madonna", "Pop", "ray_of_light",
                        "1. Drowned World/Substitute for Love\n2. Swim\n3. Ray of Light\n4. Candy Perfume Girl\n5. Skin\n6. Nothing Really Matters\n7. Sky Fits Heaven\n8. Shanti/Ashtangi\n9. Frozen\n10. The Power of Good-Bye\n11. To Have and Not to Hold\n12. Little Star\n13. Mer Girl"},
                {"Confessions on a Dance Floor", "Hung Up", "Sorry", String.valueOf(R.raw.hung_up), String.valueOf(R.raw.sorry), "Madonna", "Pop", "confessions_on_a_dance_floor",
                        "1. Hung Up\n2. Get Together\n3. Sorry\n4. Future Lovers\n5. I Love New York\n6. Let It Will Be\n7. Forbidden Love\n8. Jump\n9. How High\n10. Isaac\n11. Push\n12. Like It or Not"},

                // Álbumes de Jazz
                // Miles Davis
                {"Kind of Blue", "So What", "All Blues", String.valueOf(R.raw.so_what), String.valueOf(R.raw.all_blues), "Miles Davis", "Jazz", "kind_of_blue",
                        "1. So What\n2. Freddie Freeloader\n3. Blue in Green\n4. All Blues\n5. Flamenco Sketches"},
                {"Bitches Brew", "Pharaoh's Dance", "Spanish Key", String.valueOf(R.raw.pharaohs_dance), String.valueOf(R.raw.spanish_key), "Miles Davis", "Jazz", "bitches_brew",
                        "1. Pharaoh's Dance\n2. Bitches Brew\n3. Spanish Key\n4. John McLaughlin\n5. Miles Runs the Voodoo Down\n6. Sanctuary\n7. Feio"},
                {"In a Silent Way", "Shhh/Peaceful", "In a Silent Way/It's About That Time", String.valueOf(R.raw.shhh_peaceful), String.valueOf(R.raw.in_a_silent_way), "Miles Davis", "Jazz", "in_a_silent_way",
                        "1. In a Silent Way/It's About That Time"},
                {"Sketches of Spain", "Concierto de Aranjuez", "Solea", String.valueOf(R.raw.concierto_de_aranjuez), String.valueOf(R.raw.solea), "Miles Davis", "Jazz", "sketches_of_spain",
                        "1. Concierto de Aranjuez (Adagio)\n2. Will o' the Wisp\n3. The Pan Piper\n4. Saeta\n5. Solea"},

                // Charles Mingus
                {"Mingus Ah Um", "Goodbye Pork Pie Hat", "Fables of Faubus", String.valueOf(R.raw.goodbye_pork_pie_hat), String.valueOf(R.raw.fables_of_faubus), "Charles Mingus", "Jazz", "mingus_ah_um",
                        "1. Better Git It in Your Soul\n2. Goodbye Pork Pie Hat\n3. Boogie Stop Shuffle\n4. Self-Portrait in Three Colors\n5. Open Letter to Duke\n6. Bird Calls\n7. Fables of Faubus\n8. Pussy Cat Dues\n9. Jelly Roll"},
                {"The Black Saint and the Sinner Lady", "Track A - Solo Dancer", "Track B - Duet Solo Dancers", String.valueOf(R.raw.track_a_solo_dancer), String.valueOf(R.raw.track_b_duet_solo_dancers), "Charles Mingus", "Jazz", "black_saint_and_sinner_lady",
                        "1. Track A - Solo Dancer\n2. Track B - Duet Solo Dancers\n3. Track C - Group Dancers\n4. Mode D - Trio and Group Dancers\n5. Mode E - Single Solos and Group Dance\n6. Mode F - Group and Solo Dance"},
                {"Blues & Roots", "Moanin'", "Wednesday Night Prayer Meeting", String.valueOf(R.raw.moanin), String.valueOf(R.raw.wednesday_night_prayer_meeting), "Charles Mingus", "Jazz", "blues_and_roots",
                        "1. Wednesday Night Prayer Meeting\n2. Cryin' Blues\n3. Moanin'\n4. Tensions\n5. My Jelly Roll Soul"},
                {"Mingus Dynasty", "Slop", "Diane", String.valueOf(R.raw.slop), String.valueOf(R.raw.diane), "Charles Mingus", "Jazz", "mingus_dynasty",
                        "1. Slop\n2. Diane\n3. Song with Orange\n4. Gunslinging Bird\n5. Things Ain't What They Used to Be"},

                // Dave Brubeck
                {"Time Out", "Take Five", "Blue Rondo à la Turk", String.valueOf(R.raw.take_five), String.valueOf(R.raw.blue_rondo), "Dave Brubeck", "Jazz", "time_out",
                        "1. Blue Rondo à la Turk\n2. Strange Meadow Lark\n3. Take Five\n4. Three to Get Ready\n5. Kathy's Waltz\n6. Everybody's Jumpin'\n7. Pick Up Sticks"},
                {"Time Further Out", "It's a Raggy Waltz", "Unsquare Dance", String.valueOf(R.raw.its_a_raggy_waltz), String.valueOf(R.raw.unsquare_dance), "Dave Brubeck", "Jazz", "time_further_out",
                        "1. It's a Raggy Waltz\n2. Bluette\n3. Charles Matthew Hallelujah\n4. Far More Blue\n5. Far More Drums\n6. Maori Blues\n7. Unsquare Dance\n8. Bru's Boogie Woogie"},
                {"Brubeck Time", "Audrey", "Jeepers Creepers", String.valueOf(R.raw.audrey), String.valueOf(R.raw.jeepers_creepers), "Dave Brubeck", "Jazz", "brubeck_time",
                        "1. Audrey\n2. Jeepers Creepers\n3. Pennies from Heaven\n4. Why Do I Love You\n5. Stompin' for Mili\n6. Keepin' Out of Mischief Now\n7. A Fine Romance\n8. Brother, Can You Spare a Dime?\n9. Mam'selle\n10. My One Bad Habit"},
                {"Jazz Goes to College", "Balcony Rock", "Le Souk", String.valueOf(R.raw.balcony_rock), String.valueOf(R.raw.le_souk), "Dave Brubeck", "Jazz", "jazz_goes_to_college",
                        "1. Balcony Rock\n2. Out of Nowhere\n3. Le Souk\n4. Take the 'A' Train\n5. The Song Is You\n6. Don't Worry 'Bout Me\n7. I Want to Be Happy"},

                // John Coltrane
                {"A Love Supreme", "Acknowledgement", "Resolution", String.valueOf(R.raw.acknowledgement), String.valueOf(R.raw.resolution), "John Coltrane", "Jazz", "a_love_supreme",
                        "1. Part I: Acknowledgement\n2. Part II: Resolution\n3. Part III: Pursuance\n4. Part IV: Psalm"},
                {"Giant Steps", "Giant Steps", "Naima", String.valueOf(R.raw.giant_steps), String.valueOf(R.raw.naima), "John Coltrane", "Jazz", "giant_steps",
                        "1. Giant Steps\n2. Cousin Mary\n3. Countdown\n4. Spiral\n5. Syeeda's Song Flute\n6. Naima"},
                {"Blue Train", "Blue Train", "Moment's Notice", String.valueOf(R.raw.blue_train), String.valueOf(R.raw.moments_notice), "John Coltrane", "Jazz", "blue_train",
                        "1. Blue Train\n2. Moment's Notice\n3. Locomotion\n4. I'm Old Fashioned\n5. Lazy Bird"},
                {"My Favorite Things", "My Favorite Things", "Summertime", String.valueOf(R.raw.my_favorite_things), String.valueOf(R.raw.summertime), "John Coltrane", "Jazz", "my_favorite_things",
                        "1. My Favorite Things\n2. Everytime We Say Goodbye\n3. Summertime\n4. But Not for Me"},

                // Antonio Vivaldi
                {"The Four Seasons", "Spring", "Winter", String.valueOf(R.raw.spring), String.valueOf(R.raw.winter), "Antonio Vivaldi", "Clásica", "four_seasons",
                        "Concierto No. 1 \"Spring\":\n1. Allegro\n2. Largo e pianissimo sempre\n3. Danza pastorale (Allegro)\n\nConcierto No. 4 \"Winter\":\n1. Allegro non molto\n2. Largo\n3. Allegro"},
                {"Gloria", "Gloria in excelsis Deo", "Laudamus te", String.valueOf(R.raw.gloria_in_excelsis_deo), String.valueOf(R.raw.laudamus_te), "Antonio Vivaldi", "Clásica", "gloria",
                        "1. Gloria in excelsis Deo\n2. Laudamus te\n3. Gratias agimus tibi\n4. Domine Deus\n5. Qui tollis peccata mundi\n6. Quoniam tu solus Sanctus\n7. Cum Sancto Spiritu"},
                {"L'estro armonico", "Concerto No. 8 in A minor", "Concerto No. 11 in D minor", String.valueOf(R.raw.concerto_no_8), String.valueOf(R.raw.concerto_no_11), "Antonio Vivaldi", "Clásica", "lestro_armonico",
                        "Concierto No. 8 in A minor:\n1. Allegro\n2. Larghetto e spiritoso\n3. Allegro\n\nConcierto No. 11 in D minor:\n1. Allegro\n2. Largo e spiccato\n3. Allegro"},
                {"La Stravaganza", "Concerto No. 2 in E minor", "Concerto No. 12 in G major", String.valueOf(R.raw.concerto_no_2), String.valueOf(R.raw.concerto_no_12), "Antonio Vivaldi", "Clásica", "la_stravaganza",
                        "Concierto No. 2 in E minor:\n1. Allegro\n2. Largo\n3. Allegro\n\nConcierto No. 12 in G major:\n1. Allegro\n2. Largo\n3. Allegro"},

                // Wolfgang Amadeus Mozart
                {"Eine kleine Nachtmusik", "Allegro", "Romanze", String.valueOf(R.raw.allegro), String.valueOf(R.raw.romance), "Wolfgang Amadeus Mozart", "Clásica", "eine_kleine_nachtmusik",
                        "1. Allegro\n2. Romanze (Andante)\n3. Menuetto (Allegretto)\n4. Rondo (Allegro)"},
                {"Symphony No. 40", "Molto allegro", "Andante", String.valueOf(R.raw.symphony_no_40_molto_allegro), String.valueOf(R.raw.symphony_no_40_andante), "Wolfgang Amadeus Mozart", "Clásica", "symphony_no_40",
                        "1. Molto allegro\n2. Andante\n3. Menuetto (Allegretto) - Trio\n4. Allegro assai"},
                {"Piano Sonata No. 11", "Rondo alla turca", "Adagio", String.valueOf(R.raw.rondo_alla_turca), String.valueOf(R.raw.adagio), "Wolfgang Amadeus Mozart", "Clásica", "piano_sonata_no_11",
                        "1. Allegro\n2. Menuetto\n3. Allegretto (Rondo alla turca)"},
                {"Requiem", "Introitus", "Dies irae", String.valueOf(R.raw.introitus), String.valueOf(R.raw.dies_irae), "Wolfgang Amadeus Mozart", "Clásica", "requiem",
                        "1. Introitus (Requiem aeternam)\n2. Kyrie\n3. Dies irae\n4. Tuba mirum\n5. Rex tremendae\n6. Recordare\n7. Confutatis\n8. Lacrimosa\n9. Amen"},

                // Ludwig van Beethoven
                {"Symphony No. 9", "Ode to Joy", "Scherzo", String.valueOf(R.raw.ode_to_joy), String.valueOf(R.raw.scherzo), "Ludwig van Beethoven", "Clásica", "symphony_no_9",
                        "1. Allegro ma non troppo, un poco maestoso\n2. Molto vivace\n3. Adagio molto e cantabile\n4. Presto - Allegro assai\nOde to Joy (Finale)"},
                {"Piano Sonata No. 14", "Moonlight Sonata", "Presto agitato", String.valueOf(R.raw.moonlight_sonata), String.valueOf(R.raw.presto_agitato), "Ludwig van Beethoven", "Clásica", "moonlight_sonata",
                        "1. Adagio sostenuto\n2. Allegretto\n3. Presto agitato"},
                {"Symphony No. 5", "Allegro con brio", "Andante con moto", String.valueOf(R.raw.symphony_no_5_allegro_con_brio), String.valueOf(R.raw.symphony_no_5_andante_con_moto), "Ludwig van Beethoven", "Clásica", "symphony_no_5",
                        "1. Allegro con brio\n2. Andante con moto\n3. Allegro - Trio\n4. Allegro"},
                {"Violin Concerto", "Allegro ma non troppo", "Larghetto", String.valueOf(R.raw.violin_concerto_allegro), String.valueOf(R.raw.violin_concerto_larghetto), "Ludwig van Beethoven", "Clásica", "violin_concerto",
                        "1. Allegro ma non troppo\n2. Larghetto\n3. Rondo (Allegro)"},

                // Georges Bizet
                {"Carmen Suite No. 1", "Prelude", "Aragonaise", String.valueOf(R.raw.prelude), String.valueOf(R.raw.aragonaise), "Georges Bizet", "Clásica", "carmen_suite_no_1",
                        "1. Prélude\n2. Aragonaise\n3. Intermezzo\n4. Les Dragons d'Alcala\n5. Habanera\n6. Entr'acte\n7. Chanson du Toréador"},
                {"L'Arlésienne Suite No. 1", "Prélude", "Minuetto", String.valueOf(R.raw.arlesienne_suite_prelude), String.valueOf(R.raw.arlesienne_suite_minuetto), "Georges Bizet", "Clásica", "larlesienne_suite_no_1",
                        "1. Prélude\n2. Menuet\n3. Adagietto\n4. Carillon"},
                {"Symphony in C", "Allegro vivo", "Andante", String.valueOf(R.raw.symphony_in_c_allegro_vivo), String.valueOf(R.raw.symphony_in_c_andante), "Georges Bizet", "Clásica", "symphony_in_c",
                        "1. Allegro vivo\n2. Andante\n3. Allegro vivace\n4. Finale (Allegro)"},
                {"Jeux d'enfants", "Petite Suite", "La Toupie", String.valueOf(R.raw.jeux_denfants_petite_suite), String.valueOf(R.raw.jeux_denfants_la_toupie), "Georges Bizet", "Clásica", "jeux_denfants",
                        "1. Marche\n2. Berceuse\n3. Impromptu\n4. Duo\n5. Galop"}

        };

        for (String[] albumDetail : albumDetails) {
            String albumTitle = albumDetail[0];
            ArrayList<String> songTitles = new ArrayList<>(Arrays.asList(albumDetail).subList(1, 3));
            ArrayList<Integer> songResIds = new ArrayList<>();
            for (int i = 3; i < 5; i++) {
                songResIds.add(Integer.parseInt(albumDetail[i]));
            }
            String musician = albumDetail[5];
            String genre = albumDetail[6];
            String cover = albumDetail[7];
            String tracklist = albumDetail[8];
            Album album = new Album(albumTitle, songTitles, songResIds, musician, genre, cover, tracklist);
            albums.add(album);
        }

        return albums;
    }
}

