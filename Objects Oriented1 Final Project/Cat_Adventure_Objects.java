/*
 * Author: Nicole Hackler
 * Date: 8/31/2023
 * 
 * This is my Final Project for Objects Oriented 1. 
 * This is a modified version of a previous project. I've created on object called Scene and placed it in
 * an array. 
 * 
 * *** Note:There is a "Hidden" variable for each scene, this is for my notes of knowing what choice and 
 * reaction is tied together in the methods below. there is notes on each one knowing where they go to next 
 * for debugging purposes. For now the Int variable has nothing for the program but to help me keep track of 
 * the scenes. ***
 * 
 * *The shortest way through the story is to use the 2nd option the whole way, FYI.*
 */
//importing the Scanner for the all the methods (Each method has its own scanner)
import java.util.Scanner;

public class Cat_Adventure_Objects {
	//Main Method
	public static void main(String[] args) {
		//Creating the scanner
		Scanner input = new Scanner(System.in);
		//Creating the array for the objects
		Scene[] scenes = new Scene[39];
		
		//Array of objects containing the different scenes, the "hidden" number is for reference to the Scene (reaction) numbers
		scenes[0] = new Scene(0, "You blink, yawn and look comfy. You sun sunbathe for awhile longer, \nand then something catches your eyes outside.");
		scenes[1] = new Scene(1, "Stepping down from the window, you take a stretch and yawn one more time. \nTime to go in search for your owner.");
		scenes[2] = new Scene(2,"Your owner doesn't come right away. \"MEOW!!\" You make your voice heard until \nthey do. When you see them you stretch BIG and touch the handle of the door to \nlet us out, as they open the door you race outside to see what we can find!");
		scenes[3] = new Scene(3, "You walk through the doorway and see your owner inside. \"MEOW!!\" You get their \nattention and rub your body between their legs, then walk back to the door \nleading outside. Your owner follows you as you reach the door you \"Meow\" one more \ntime to let them know you want outside. They open the door to let you out. \nWhere to start exploring?");
		scenes[4] = new Scene(4, "Stepping into the living room you do not see your owner. What do you do?");
		scenes[5] = new Scene(8, "Jumping down from the windowsill and prance to the door. Looking back to see if \nyour owner is following. They are you meow loudly again, as they open the door \nyou race outside to start exploring! Where to start?");
		scenes[6] = new Scene(9, "As you get close to the bushes, out jump two dogs! \"HISSSS\" You run as fast \nas you can into the forest behind the house to get away.");
		scenes[7] = new Scene(10, "You start sniffing around, and looking under the underbrush. Something \ncatches your eyes inside the forest.");
		scenes[8] = new Scene(11, "You climb up the nearest tree, and your little heart is pounding. Up here \nyou can see everything, the mountains, the forest, and even your house. What do you do?");
		scenes[9] = new Scene(12, "You keep running, your heart is just pounding. After some time you \nrealize you are alone and lost. What do you do?");
		scenes[10] = new Scene(13, "You see there is no way down without getting attacked by the dogs. You find \na nice branch and soon fall asleep tucked up in the tree. You are awoken to your \nowner's voice calling your name. Looking down you see the dogs are gone and it's \nsafe to climb down. As you hit the forest floor on all four you take off in the \ndirection of the familiar voice.");
		scenes[11] = new Scene(14, "\"MEEEOOOOW!!\" You meow loud over and over. This causes the dogs to bark even louder.");
		scenes[12] = new Scene(15, "The dogs keep barking, but in the distance you hear a door close. \nYou can see your owner heading in this direction. Do you jump down and try to run out run the \ndogs to get to your owner?");
		scenes[13] = new Scene(17, "You try to climb down the tree, but the dogs start jumping at you. \nYou become even more frightened and climb higher into the tree. What now?");
		scenes[14] = new Scene(18, "\"MEOW, MEEOOOW!!\" You hear your owner's voice, so you meow even more so \nthey know you are there. They see you are in the tree, and scare the dogs away. \nSeeing the dogs running away you climb down the tree to reach your owner. \nYou feel safe in their arms as they walk you back home.");
		scenes[15] = new Scene(20, "As you climb further up the tree you see a branch from another tree. Do you stay and meow or are are you brave enough to jump?");
		scenes[16] = new Scene(22, "You jump to the branch, the dogs follow you on the ground. You are trapped. \n\"MEOW!\" Crying out as loud as you can. You hear your owner's voice. They are \nyelling at the dogs and manage to scare them away from you. \"Meow, Meow.\" \nClimbing down to your owner's are, you are safe now.");
		scenes[17] = new Scene(23, "Curiosity of a cat leads you to the underbrush. You hear rustling in the \nbrushes, the hair on your back stands up... \"HHHIIISSS!\" Out jump wild dogs!");
		scenes[18] = new Scene(24, "Curiosity of a cat gets you wondering further into the forest, or does it?");
		scenes[19] = new Scene(25, "Everything outside doesn't catch your interest at all, \nyou'd rather be inside getting pets and love from your owner. As you head across the back yard \nyou hear rustling in the bushes..?");
		scenes[20] = new Scene(26, "Your eyes and ears find a bee wondering from flower to flower.");
		scenes[21] = new Scene(27, "You ignore the noise and head home. As you reach the door leading inside, \n\"MEOW!\" you meow loudly until your owner opens the door for you. You greet \nthem with \"meow, meow,\" and rubbing your body all over their legs. \nYou are safe and sound, just the purrrrfect day.");
		scenes[22] = new Scene(30, "The noise from the the bee's wings are so catching. You stalk the bee moving \naround a patch of flowers. You make yourself as small as you can and your back \nlegs start to wiggle. SPRING! You jump on the bee, but it hurts. \"RWAAR, MEOOW!\" \nYou cry out in pain. you try to run away from the hurt.");
		scenes[23] = new Scene(31, "Slowly making your way back, you smell as you go, \nthen you catch the smell of something canine. What do you do?");
		scenes[24] = new Scene(32, "You start exploring some more and hear the sound of running water. Do you \nchoose to investigate the water sound or explore a different direction?");
		scenes[25] = new Scene(34, "As you venture back the way you came. the smell of the canine disappears.");
		scenes[26] = new Scene(35, "As you smell your way back, you hear a voice calling your name. This makes \nyou pick up the pace and run, you know its dinner time, and this adventure has \nmade you hungry. You come out of the forest seeing your owner standing there \nwaiting to greet you. \"MEOW!\"");
		scenes[27] = new Scene(37, "Coming through the underbrush you see a little stream and a tiny waterfall.");
		scenes[28] = new Scene(38, "Something catches your eyes, its movement. \nIt doesn't sound scary and you want to investigate.");
		scenes[29] = new Scene(40, "You feel sleepy and find a nice little space up against a tree to fall \nasleep. You are woken by noises in the underbrush, it catches you off guard.");
		scenes[30] = new Scene(41, "You follow the small stream and see a den like opening. Do you venture close?");
		scenes[31] = new Scene(42, "You are so sleepy your survival instinct kicks in. You start running, as you \nget further away from the sound of water you hear a familiar voice. You are still \nfrightened by the sound that woke you.");
		scenes[32] = new Scene(43, "You see an empty decaying log and rush to get inside. Just as you do you hear \na familiar voice, \"There you are. I've been looking for you everywhere.\" You stop \nand are instantly excited, your owner has found you. \"MEOW!!\" You start rubbing \nall over their legs. \"PppUURrrr.\" You start purring, they pick you up and walk you \nout of the forest. You know it's dinner time are you are HUNGRY!");
		scenes[33] = new Scene(45, "As you keep running you feel as if something is chasing you. You're scared, \nbut you hear a distant sound that is familiar to you. You hear the sound of \nyour owner's voice this makes you know you are close to home. Plus your stomach \nis grumbling. You pick up the pace and run across the forest floor, coming out \nfrom under the underbrush seeing your owner standing there waiting for you \nwith a big smile.");
		scenes[34] = new Scene(46, "As you venture close to the opening of the den, the hair on your \nback starts to stand up and the air doesn't smell right.");
		scenes[35] = new Scene(47, "The hair on your back starts to stand up. Your body \nis telling you \"NO WAY ARE WE GOING IN THERE!\" The sun is going down.");
		scenes[36] = new Scene(52, "You get into your 'pounce' stance and decide to go for it! Just as you \nland you catch a mouse. You hear your owner's voice calling your name. \nThey will be so happy to see the mouse you've caught! You prance off with \nyour price for the day. \"Pppuuurrr.\" You purr the whole way home.");
		scenes[37] = new Scene(52, "Just as you decide to chase the movement it goes quiet and you can't \nfind it. The sun is fading, you can hear the sound of your owner's voice. \nIt's dinner time!");
		scenes[38] = new Scene(54, "\nThanks for reading and exploring. \n            THE END");
		
		//Title and the beginning of the adventure
				System.out.println("                            ****CAT ADVENTURE****");
				System.out.println("                            ---------------------");
				System.out.println();
				System.out.println("Welcome to choose your own adventure. Please enter a 1, 2, or a 3 to progress the story.");
				System.out.println();
				System.out.println("Your day starts off inside your cozy home.");			
				
				//start of the options made be the reader
				System.out.println("Looking out the window, your owner comes by and asks, \"do you want to go outside?\"");
				System.out.println();
				System.out.println("1: \"meow\" (want to stay inside)");
				System.out.println("2: \"MEOW!\" (want to go outside YES!)");
				int user = input.nextInt();
				if(checkUserError(user)) { //check user input
					if (user == 1) {
						choice0(scenes); //choice 0 / Reaction 0
					} else {
						choice8(scenes); //choice 8 / Reaction 8
					}
				} else {
					System.out.println("You got defaulted to choice 1");
					choice0(scenes); //choice 0 / Reaction 0
				}

	} //Main method end
	
	//Choice0 method begin
	public static void choice0(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[0].getScene()); //choice0 / reaction 0
		System.out.println();
		System.out.println("1: Find owner to go outside.");
		System.out.println("2: Meow loudly at the door. \"MEOW!\"");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice1(scenes); //choice 1 / reaction 1
			} else {
				choice2(scenes); //choice 2 / reaction 2
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice2(scenes); //choice 2 / reaction 2
		}
	} //Choice0 method end
	//Choice1 method begin
	public static void choice1(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[1].getScene()); //choice 1 / reaction 1
		System.out.println();
		System.out.println("1: Look for owner in the bedroom?"); 
		System.out.println("2: Look for owner in the living room?"); 
		System.out.println("3: Change your mind and meow loudly at the door?"); 
		int user = input.nextInt();
		if(checkUserError2(user)) { //check user input
			if (user == 1) {
				choice3(scenes); //choice 3 / to outside (9/10)
			} else if (user == 2) {
				choice4(scenes); //choice 4 / reaction 4
			} else {
				choice2(scenes); //choice 7 goes to reaction 2
			}
		} else {
			System.out.println("You got defaulted to choice 3");
			choice2(scenes); //choice 7 goes to reaction 2
		}
	}//Choice1 method end
	//Choice2 method begin
	public static void choice2(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[2].getScene()); //choice 2 / reaction 2
		System.out.println();
		System.out.println("1: Rustling in the bushes?..");
		System.out.println("2: Edge of the forest?..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice9(scenes); //choice 9 / reaction 6
			} else {
				choice10(scenes); //choice 10 / reaction 7
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice10(scenes); //choice 10 / reaction 7
		}
	} //Choice2 method end
	//Choice3 method begin
	public static void choice3(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[3].getScene()); //choice 3 / reaction 3
		System.out.println();
		System.out.println("1: Rustling in the bushes?..");
		System.out.println("2: Edge of the forest?..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice9(scenes); //choice 9 / reaction 6
			} else {
				choice10(scenes); //choice 10 / reaction 7
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice9(scenes); //choice 9 / reaction 6
		}
	} //Choice3 method end
	//Choice3 method begin
	public static void choice4(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[4].getScene()); //choice 4 / reaction 4
		System.out.println();
		System.out.println("1: Look for owner in the bedroom?");
		System.out.println("2: Go back to the door and \"MEOW\" at the door?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice3(scenes); //choice 5 / reaction 3
			} else {
				choice2(scenes); //choice 6 / reaction 2 to outside (9/10)
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice2(scenes); //choice 6 / reaction 2 to outside (9/10)
		}
	} //Choice3 method end
	//Choice8 method begin
	public static void choice8(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[5].getScene()); //choice 8 / reaction 5
		System.out.println();
		System.out.println("1: Rustling in the bushes?..");
		System.out.println("2: Edge of the forest?..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice9(scenes); //choice 9 / reaction 6
			} else {
				choice10(scenes); //choice 10 / reaction 7
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice9(scenes); //choice 9 / reaction 6
		}
	} //Choice8 method end
	//Choice9 method begin
	public static void choice9(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[6].getScene()); //choice 9 / reaction 6
		System.out.println();
		System.out.println("1: Climb a tree!?!?");
		System.out.println("2: or continue to run further into the forest?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice11(scenes); //choice 11 / reaction 8
			} else {
				choice12(scenes); //choice 12 / reaction 9
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice12(scenes); //choice 12 / reaction 9
		}
	} //Choice9 method end
	//Choice10 method begin
	public static void choice10(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[7].getScene()); //choice 10 / reaction 7
		System.out.println();
		System.out.println("1: Do you stay exploring the yard?");
		System.out.println("2: Head off into the forest to see what the movement is..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				System.out.println(scenes[17].getScene()); //choice 23 / reaction 17
				choice9(scenes); // returns to choice 9
			} else {
				choice24(scenes); //choice 24 / reaction 18
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice9(scenes); // returns to choice 9
		}
	} //Choice10 method end
	//Choice11 method begin (story ending in this method)
	public static void choice11(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[8].getScene()); //choice 11 / reaction 8
		System.out.println();
		System.out.println("1: \"MEOW!!\" meow loud as you can in hopes your owner hears you?");
		System.out.println("2: Wait the dogs out?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice14(scenes); //choice 14 / reaction 11
			} else {
				System.out.println(scenes[13].getScene()); //choice 13 / reaction 10
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			System.out.println(scenes[13].getScene()); //choice 13 / reaction 10
			System.out.println();
			System.out.println(scenes[38].getScene()); //Ending to story
		}
	} //Choice11 method end
	//Choice12 method begin
	public static void choice12(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[9].getScene()); //choice 12 / reaction 9
		System.out.println();
		System.out.println("1: Dare to back track your steps?");
		System.out.println("2: Too scared to go back that way? Find a new path");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice31(scenes); //choice 31 / reaction 23
			} else {
				choice32(scenes); //choice 32 / reaction 24
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice31(scenes); //choice 31 / reaction 23
		}
	} //Choice12 method end
	//Choice14 method begin (story ending in this method)
	public static void choice14(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[11].getScene()); //choice 14 / reaction 11
		System.out.println();
		System.out.println("1: Keep meowing? \"MEOW!!\"");
		System.out.println("2: Wait the dogs out?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice15(scenes); //choice 15 / reaction 12
			} else {
				System.out.println(scenes[13].getScene()); //choice 16 / reaction 10
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			System.out.println(scenes[13].getScene()); //choice 16 / reaction 10
			System.out.println();
			System.out.println(scenes[38].getScene()); //Ending to story
		}
	} //Choice14 method end
	//Choice15 method begin (story ending in this method)
	public static void choice15(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[12].getScene()); //choice 15 / reaction 12
		System.out.println();
		System.out.println("1: Jump down and make a run for it!");
		System.out.println("2: Meow loader and draw your owner to you.");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice17(scenes); //choice 17 / reaction 13
			} else {
				System.out.println(scenes[14].getScene()); //choice 18 / reaction 14
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice17(scenes); //choice 17 / reaction 13
		}
	} //Choice15 method end
	//Choice17 method begin (story ending in this method)
	public static void choice17(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[13].getScene()); //choice 17 / reaction 13
		System.out.println();
		System.out.println("1: Continue to Meow so your owner will hear your voice?");
		System.out.println("2: Climbing further up the tree?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				System.out.println(scenes[14].getScene()); //choice 19 / reaction 14
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			} else {
				choice20(scenes); //choice 20 / reaction 15
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice20(scenes); //choice 20 / reaction 15
		}
	} //Choice17 method end
	//Choice20 method begin (story ending in this method)
	public static void choice20(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[15].getScene()); //choice 20 / reaction 15
		System.out.println();
		System.out.println("1: Jump down and make a run for it!");
		System.out.println("2: Meow loader and draw your owner to you.");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				System.out.println(scenes[14].getScene()); //choice 21 / reaction 14
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			} else {
				System.out.println(scenes[16].getScene()); //choice 22 / reaction 16
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			System.out.println(scenes[14].getScene()); //choice 21 / reaction 14
			System.out.println();
			System.out.println(scenes[38].getScene()); //Ending to story		
		}
	} //Choice20 method end
	//Choice 24 method begin
	public static void choice24(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[18].getScene()); //choice 24 / reaction 18
		System.out.println();
		System.out.println("1: Decide to go home..");
		System.out.println("2: Let curiosity take you..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice25(scenes); //choice 25 / reaction 19
			} else {
				choice26(scenes); //choice 26 / reaction 20
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice26(scenes); //choice 26 / reaction 20
		}
	} //Choice 24 method end
	//Choice25 method begin (story ending in this method)
	public static void choice25(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[19].getScene()); //choice 25 / reaction 19
		System.out.println();
		System.out.println("1: Ignore the bushes and head to the back door.");
		System.out.println("2: The noise in the bushes is calling your name.");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				System.out.println(scenes[21].getScene()); //choice 27 / reaction 21
				System.out.println();
				System.out.println(scenes[38].getScene()); //Ending to story
			} else {
				choice9(scenes); //choice 28, returns to choice 9 
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			System.out.println(scenes[21].getScene()); //choice 27 / reaction 21
			System.out.println();
			System.out.println(scenes[38].getScene()); //Ending to story
		}
	} //Choice 25 method end
	//Choice26 method begin
	public static void choice26(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[20].getScene()); //choice 26 / reaction 20
		System.out.println();
		System.out.println("1: See whats in the bushes..");
		System.out.println("2: Continue to follow the bee as his little noises and movement keep your attention..");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice9(scenes); //choice 30, returns to choice 9 
			} else {
				System.out.println(scenes[22].getScene()); //choice 30 / reaction 22
				choice12(scenes); //returns to choice 12
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			System.out.println(scenes[22].getScene()); //choice 30 / reaction 22
			choice12(scenes); //returns to choice 12
		}
	} //Choice26 method end
	//Choice31 method begin
	public static void choice31(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[23].getScene()); //choice 31 / reaction 23
		System.out.println();
		System.out.println("1: Go back and find a new path?");
		System.out.println("2: Continue in hope there are no dogs?");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				choice32(scenes); //choice 33 / reaction 24 (returns to choice 32)
			} else {
				choice34(scenes); //choice 34 / reaction 25
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice32(scenes); //choice 33 / reaction 24 (returns to choice 32)
		}
	} //Choice31 method end
	//Choice32 method begin (story ending in this method)
	public static void choice32(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[24].getScene()); //choice 32 / reaction 24
		System.out.println();
		System.out.println("1: Investigate the water sound?");
		System.out.println("2: Choose to explore a different direction?");
		System.out.println("3: Venture back the way you came and go home?"); 
		int user = input.nextInt();
		if(checkUserError2(user)) { //check user input
			if (user == 1) {
				choice37(scenes); //choice 37 / reaction 27
			} else if (user == 2) {
				choice38(scenes); //choice 38 / reaction 28 
			} else {
				System.out.println(scenes[26].getScene()); //choice 39 / reaction 26
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			}
		} else {
			System.out.println("You got defaulted to choice 3");
			System.out.println(scenes[26].getScene()); //choice 39 / reaction 26
			System.out.println();
			System.out.println(scenes[38].getScene()); //end story
		}
	} //Choice32 method end
	//Choice34 method begin (story ending in this method)
	public static void choice34(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[25].getScene()); //choice 34 / reaction 25
		System.out.println();
		System.out.println("1: Keep going forward.");
		System.out.println("2: Continue to explore.");
		int user = input.nextInt();
		if(checkUserError(user)) { //check user input
			if (user == 1) {
				System.out.println(scenes[26].getScene()); //choice 35 / reaction 26
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			} else {
				choice32(scenes); //choice 36 / reaction 24 (returns to choice 32)
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			System.out.println(scenes[26].getScene()); //choice 35 / reaction 26
			System.out.println();
			System.out.println(scenes[38].getScene()); //end story
		}
	} //Choice34 method end
	//Choice37 method begin
	public static void choice37(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[27].getScene()); //choice 37 / reaction 27
		System.out.println();
		System.out.println("1: Take a nap.");
		System.out.println("2:Continure to explore the stream and waterfall.");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				choice40(scenes); //choice 40 / reaction 29
			} else {
				choice41(scenes); //choice 41 / reaction 30
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice41(scenes); //choice 41 / reaction 30
		}
	} //Choice37 method end
	//Choice38 method begin (story ending in this method)
	public static void choice38(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[28].getScene()); //choice 38 / reaction 28
		System.out.println();
		System.out.println("1: What could it hurt?");
		System.out.println("2: The sun is fading, go home.");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				System.out.println(scenes[36].getScene()); //choice 52 / reaction 36
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			} else {
				System.out.println(scenes[37].getScene()); //choice 53 / reaction 37
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			System.out.println(scenes[37].getScene()); //choice 53 / reaction 37
			System.out.println();
			System.out.println(scenes[38].getScene()); //end story
		}
	} //Choice38 method end
	//Choice40 method begin (story ending in this method)
	public static void choice40(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[29].getScene()); //choice 40 / reaction 29
		System.out.println();
		System.out.println("1: Run Away?");
		System.out.println("2: Run and hide close by and let the noise pass you by?");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				choice42(scenes); //choice 42 / reaction 31
			} else {
				System.out.println(scenes[32].getScene()); //choice 43 / reaction 32
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			choice42(scenes); //choice 42 / reaction 31
		}
	} //Choice40 method end
	//Choice41 method begin
	public static void choice41(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[30].getScene()); //choice 41 / reaction 30
		System.out.println();
		System.out.println("1: Yes.. ");
		System.out.println("2: \"MEOW!\" No!..");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				choice46(scenes); //choice 46 / reaction 34
			} else {
				choice47(scenes); //choice 47 / reaction 35
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice46(scenes); //choice 47 / reaction 35
		}
	} //Choice41 method end
	//Choice42 method begin (story ending in this method)
	public static void choice42(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[31].getScene()); //choice 42 / reaction 31
		System.out.println();
		System.out.println("1: Climb a tree?");
		System.out.println("2: Keep running?");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				System.out.println("You hear the sound of barking and growling..");
				choice11(scenes); //choice 44 / reaction 8
			} else {
				System.out.println(scenes[33].getScene()); //choice 45 / reaction 33
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			System.out.println("You hear the sound of barking and growling..");
			choice11(scenes); //choice 44 / reaction 8
		}
	} //Choice42 method end
	//Choice46 method begin (story ending in this method)
	public static void choice46(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[34].getScene()); //choice 46 / reaction 34
		System.out.println();
		System.out.println("1: Run and hide.");
		System.out.println("2: Choose a different direction.");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				System.out.println(scenes[32].getScene()); //choice 49 / returns to reaction 32
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			} else {
				choice38(scenes); //choice 48 / returns to reaction 28
			}
		} else {
			System.out.println("You got defaulted to choice 2");
			choice38(scenes); //choice 48 / returns to reaction 28
		}
	} //Choice46 method end
	//Choice47 method begin (story ending in this method)
	public static void choice47(Scene[] scenes) {
		Scanner input = new Scanner(System.in);
		System.out.println(scenes[35].getScene()); //choice 47 / reaction 35
		System.out.println();
		System.out.println("1: choose to head home.");
		System.out.println("2: Choose to explore more.");
		int user = input.nextInt();
		if(checkUserError(user)) {	//check user input
			if (user == 1) {
				System.out.println(scenes[26].getScene()); //choice 50 / returns to reaction 26
				System.out.println();
				System.out.println(scenes[38].getScene()); //end story
			} else {
				choice38(scenes); //choice 51 / returns to reaction 28
			}
		} else {
			System.out.println("You got defaulted to choice 1");
			System.out.println(scenes[26].getScene()); //choice 50 / returns to reaction 26
			System.out.println();
			System.out.println(scenes[38].getScene()); //end story
		}
	} //Choice46 method end
	
	//Method for checking for user input error if not a 1 or 2
	public static boolean checkUserError(int user) {
		if(user == 1 || user == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	//Method for checking for user input error if not a 1, 2 or 3
	public static boolean checkUserError2(int user) {
		if(user >= 1 || user <= 3) {
			return true;
		} else {
			return false;
		}
	}
	
} //class

