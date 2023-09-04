# JavaCatAdventureChooseAdventureGame
Text based choose your own Adventure
### Synopsis
This is a choose your own Adventure text story. It is designed to have the user of the program progress the story with imputing a choice of a number.
### Motivation
The reasons I chose to make a choose your own adventure text-base program is because I wanted to make something fun that I could include my daughter in the story of making it. She sat down with me and helped me come up with ideas on how and what the story inside the program would consist of. I wanted to include her in my school work somehow. At the time, of the course I was also struggling with methods a little, and this program help to experience those a lot more firsthand. This Verion of the Program is slightly modified to inculed an object called Scene. This was a requirement for the final project of this part of the course. I also included a contingency for if the user put the wrong number in, this was not part of the first verison of this.
### Code Example
```
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
```
### Contributors
My Daughter, Vesta helped with the story itself.
My course insturctors Beau, Rhet, and Jason all contributed input on how i could make this a better project. Beau helped with the Object, Rhet helped with designing my class for the Object in a better light along with re-designing the code to match. Jason help me find some bugs and work on the "if user imputs the wrong number" i also kept his "You got defaulted to choice X" in the program because it made me smile.
