package no.runsafe.PlayerNotes;

import java.util.Random;

public class RandomGenerator
{
	public RandomGenerator()
	{
		this.random = new Random();
	}

	public String getRandomTag()
	{
		return String.format("%s %s.", this.randomAdjective(), this.randomNoun());
	}

	private String randomAdjective()
	{
		return RandomGenerator.adjective[new Random().nextInt(RandomGenerator.adjective.length)];
	}

	private String randomNoun()
	{
		return RandomGenerator.nouns[this.random.nextInt(RandomGenerator.nouns.length)];
	}

	private Random random;

	private static String[] adjective = {
			"Adorable",
			"Beautiful",
			"Clean",
			"Drab",
			"Elegant",
			"Fancy",
			"Glamorous",
			"Handsome",
			"Long",
			"Magnificent",
			"Old-fashioned",
			"Plain",
			"Quaint",
			"Sparkling",
			"Ugliest",
			"Unsightly",
			"Wide-eyed",
			"Red",
			"Orange",
			"Yellow",
			"Green",
			"Blue",
			"Purple",
			"Gray",
			"Black",
			"White",
			"Alive",
			"Better",
			"Careful",
			"Clever",
			"Dead",
			"Easy",
			"Famous",
			"Gifted",
			"Helpful",
			"Important",
			"Inexpensive",
			"Mushy",
			"Odd",
			"Powerful",
			"Rich",
			"Shy",
			"Tender",
			"Uninterested",
			"Vast",
			"Wrong",
			"Angry",
			"Bewildered",
			"Clumsy",
			"Defeated",
			"Embarrassed",
			"Fierce",
			"Grumpy",
			"Helpless",
			"Itchy",
			"Jealous",
			"Lazy",
			"Mysterious",
			"Nervous",
			"Obnoxious",
			"Panicky",
			"Repulsive",
			"Scary",
			"Thoughtless",
			"Uptight",
			"Worried",
			"Cooing",
			"Deafening",
			"Faint",
			"Hissing",
			"Loud",
			"Melodic",
			"Noisy",
			"Purring",
			"Quiet",
			"Raspy",
			"Screeching",
			"Thundering",
			"Voiceless",
			"Whispering",
			"Big",
			"Colossal",
			"Fat",
			"Gigantic",
			"Great",
			"Huge",
			"Immense",
			"Large",
			"Little",
			"Mammoth",
			"Massive",
			"Miniature",
			"Petite",
			"Puny",
			"Scrawny",
			"Short",
			"Small",
			"Tall",
			"Teeny",
			"Teeny-tiny",
			"Tiny",
			"Broad",
			"Chubby",
			"Crooked",
			"Curved",
			"Deep",
			"Flat",
			"High",
			"Hollow",
			"Low",
			"Narrow",
			"Round",
			"Shallow",
			"Skinny",
			"Square",
			"Steep",
			"Straight",
			"Wide",
			"Agreeable",
			"Brave",
			"Calm",
			"Delightful",
			"Eager",
			"Faithful",
			"Gentle",
			"Happy",
			"Jolly",
			"Kind",
			"Lively",
			"Nice",
			"Obedient",
			"Proud",
			"Relieved",
			"Silly",
			"Thankful",
			"Victorious",
			"Witty",
			"Zealous",
			"Boiling",
			"Breeze",
			"Broken",
			"Bumpy",
			"Chilly",
			"Cold",
			"Cool",
			"Creepy",
			"Crooked",
			"Cuddly",
			"Curly",
			"Damaged",
			"Damp",
			"Dirty",
			"Dry",
			"Dusty",
			"Filthy",
			"Flaky",
			"Fluffy",
			"Freezing",
			"Hot",
			"Warm",
			"Wet",
			"Abundant",
			"Empty",
			"Few",
			"Full",
			"Heavy",
			"Light",
			"Many",
			"Numerous",
			"Sparse",
			"Substantial",
			"Bitter",
			"Delicious",
			"Fresh",
			"Greasy",
			"Juicy",
			"Hot",
			"Icy",
			"Loose",
			"Melted",
			"Nutritious",
			"Prickly",
			"Rainy",
			"Rotten",
			"Salty",
			"Sticky",
			"Strong",
			"Sweet",
			"Tart",
			"Tasteless",
			"Uneven",
			"Weak",
			"Wet",
			"Wooden",
			"Yummy",
			"Ancient",
			"Brief",
			"Early",
			"Fast",
			"Late",
			"Long",
			"Modern",
			"Old",
			"Old-fashioned",
			"Quick",
			"Rapid",
			"Short",
			"Slow",
			"Swift",
			"Young"
	};

	private static String[] nouns = {
			"Ball",
			"Bat",
			"Bed",
			"Book",
			"Boy",
			"Bun",
			"Can",
			"Cake",
			"Cap",
			"Car",
			"Cat",
			"Cow",
			"Cub",
			"Cup",
			"Dad",
			"Day",
			"Dog",
			"Doll",
			"Dust",
			"Fan",
			"Feet",
			"Girl",
			"Gun",
			"Hall",
			"Hat",
			"Hen",
			"Jar",
			"Kite",
			"Man",
			"Map",
			"Men",
			"Mom",
			"Pan",
			"Pet",
			"Pie",
			"Pig",
			"Pot",
			"Rat",
			"Son",
			"Sun",
			"Toe",
			"Tub",
			"Van",
			"Apple",
			"Arm",
			"Banana",
			"Bike",
			"Bird",
			"Book",
			"Chin",
			"Clam",
			"Class",
			"Clover",
			"Club",
			"Corn",
			"Crayon",
			"Crow",
			"Crown",
			"Crowd",
			"Crib",
			"Desk",
			"Dime",
			"Dirt",
			"Dress",
			"Fang ",
			"Field",
			"Flag",
			"Flower",
			"Fog",
			"Game",
			"Heat",
			"Hill",
			"Home",
			"Horn",
			"Hose",
			"Joke",
			"Juice",
			"Kite",
			"Lake",
			"Maid",
			"Mask",
			"Mice",
			"Milk",
			"Mint",
			"Meal",
			"Meat",
			"Moon",
			"Mother",
			"Morning",
			"Name",
			"Nest",
			"Nose",
			"Pear",
			"Pen",
			"Pencil",
			"Plant",
			"Rain",
			"River",
			"Road",
			"Rock",
			"Room",
			"Rose",
			"Seed",
			"Shape",
			"Shoe",
			"Shop",
			"Show",
			"Sink",
			"Snail",
			"Snake",
			"Snow",
			"Soda",
			"Sofa",
			"Star",
			"Step",
			"Stew",
			"Stove",
			"Straw",
			"String",
			"Summer",
			"Swing",
			"Table",
			"Tank",
			"Team",
			"Tent",
			"Test",
			"Toes",
			"Tree",
			"Vest",
			"Water",
			"Wing",
			"Winter",
			"Woman",
			"Women",
			"Alarm",
			"Animal",
			"Aunt",
			"Bait",
			"Balloon",
			"Bath",
			"Bead",
			"Beam",
			"Bean",
			"Bedroom",
			"Boot",
			"Bread",
			"Brick",
			"Brother",
			"Camp",
			"Chicken",
			"Children",
			"Crook",
			"Deer",
			"Dock",
			"Doctor",
			"Downtown",
			"Drum",
			"Dust",
			"Eye",
			"Family",
			"Father",
			"Fight",
			"Flesh",
			"Food",
			"Frog",
			"Goose",
			"Grade",
			"Grandfather",
			"Grandmother",
			"Grape",
			"Grass",
			"Hook",
			"Horse",
			"Jail",
			"Jam",
			"Kiss",
			"Kitten",
			"Light",
			"Loaf",
			"Lock",
			"Lunch",
			"Lunchroom",
			"Meal",
			"Mother",
			"Notebook",
			"Owl",
			"Pail",
			"Parent",
			"Park",
			"Plot",
			"Rabbit",
			"Rake",
			"Robin",
			"Sack",
			"Sail",
			"Scale",
			"Sea",
			"Sister",
			"Soap",
			"Song",
			"Spark",
			"Space",
			"Spoon",
			"Spot",
			"Spy",
			"Summer",
			"Tiger",
			"Toad",
			"Town",
			"Trail",
			"Tramp",
			"Tray",
			"Trick",
			"Trip",
			"Uncle",
			"Vase",
			"Winter",
			"Water",
			"Week",
			"Wheel",
			"Wish",
			"Wool",
			"Yard",
			"Zebra",
			"Actor",
			"Airplane",
			"Airport",
			"Army",
			"Baseball",
			"Beef",
			"Birthday",
			"Boy",
			"Brush",
			"Bushes",
			"Butter ",
			"Cast",
			"Cave",
			"Cent",
			"Cherries",
			"Cherry",
			"Cobweb",
			"Coil",
			"Cracker",
			"Dinner",
			"Eggnog",
			"Elbow",
			"Face",
			"Fireman",
			"Flavor",
			"Gate",
			"Glove",
			"Glue",
			"Goldfish",
			"Goose",
			"Grain",
			"Hair",
			"Haircut",
			"Hobbies",
			"Holiday",
			"Hot",
			"Jellyfish",
			"Ladybug",
			"Mailbox",
			"Number",
			"Oatmeal",
			"Pail",
			"Pancake",
			"Pear",
			"Pest",
			"Popcorn",
			"Queen",
			"Quicksand",
			"Quiet",
			"Quilt",
			"Rainstorm",
			"Scarecrow",
			"Scarf",
			"Stream",
			"Street",
			"Sugar",
			"Throne",
			"Toothpaste",
			"Twig",
			"Volleyball",
			"Wood",
			"Wrench",
			"Advice",
			"Anger",
			"Answer",
			"Apple",
			"Arithmetic",
			"Badge",
			"Basket",
			"Basketball",
			"Battle",
			"Beast",
			"Beetle",
			"Beggar",
			"Brain",
			"Branch",
			"Bubble",
			"Bucket",
			"Cactus",
			"Cannon",
			"Cattle",
			"Celery",
			"Cellar",
			"Cloth",
			"Coach",
			"Coast",
			"Crate",
			"Cream",
			"Daughter",
			"Donkey",
			"Drug",
			"Earthquake",
			"Feast",
			"Fifth",
			"Finger",
			"Flock",
			"Frame",
			"Furniture",
			"Geese",
			"Ghost",
			"Giraffe",
			"Governor",
			"Honey",
			"Hope",
			"Hydrant",
			"Icicle",
			"Income",
			"Island",
			"Jeans",
			"Judge",
			"Lace",
			"Lamp",
			"Lettuce",
			"Marble",
			"Month",
			"North",
			"Ocean",
			"Patch",
			"Plane",
			"Playground",
			"Poison",
			"Riddle",
			"Rifle",
			"Scale",
			"Seashore",
			"Sheet",
			"Sidewalk",
			"Skate",
			"Slave",
			"Sleet",
			"Smoke",
			"Stage",
			"Station",
			"Thrill",
			"Throat",
			"Throne",
			"Title",
			"Toothbrush",
			"Turkey",
			"Underwear",
			"Vacation",
			"Vegetable",
			"Visitor",
			"Voyage",
			"Year",
			"Able",
			"Achieve",
			"Acoustics",
			"Action",
			"Activity",
			"Aftermath",
			"Afternoon",
			"Afterthought",
			"Apparel",
			"Appliance",
			"Beginner",
			"Believe",
			"Bomb",
			"Border",
			"Boundary",
			"Breakfast",
			"Cabbage",
			"Cable",
			"Calculator",
			"Calendar",
			"Caption",
			"Carpenter",
			"Cemetery",
			"Channel",
			"Circle",
			"Creator",
			"Creature",
			"Education",
			"Faucet",
			"Feather",
			"Friction",
			"Fruit",
			"Fuel",
			"Galley",
			"Guide",
			"Guitar",
			"Health",
			"Heart",
			"Idea",
			"Kitten",
			"Laborer",
			"Language",
			"Lawyer",
			"Linen",
			"Locket",
			"Lumber",
			"Magic",
			"Minister",
			"Mitten",
			"Money",
			"Mountain",
			"Music",
			"Partner",
			"Passenger",
			"Pickle",
			"Picture",
			"Plantation",
			"Plastic",
			"Pleasure",
			"Pocket",
			"Police",
			"Pollution",
			"Railway",
			"Recess",
			"Reward",
			"Route",
			"Scene",
			"Scent",
			"Squirrel",
			"Stranger",
			"Suit",
			"Sweater",
			"Temper",
			"Territory",
			"Texture",
			"Thread",
			"Treatment",
			"Veil",
			"Vein",
			"Volcano",
			"Wealth",
			"Weather",
			"Wilderness",
			"Wren",
			"Wrist",
			"Writer"
	};
}
