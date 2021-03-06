package stopWords;


import java.util.ArrayList;

public class StopWords {

	private static ArrayList<String> stopWordlst = new ArrayList<String>();

	/*
	 * public static void main(String[] args) { String str =
	 * "hellos world's what ()do:\""; str =
	 * str.replaceAll("[\\-\\+\\.\\^:,\\;\"()!]|'s" , "");
	 * System.out.println(str); //StopWords stopWords = new StopWords();
	 * //System.out.println(stopWords.ContainsSW("world"));
	 * 
	 * }
	 */
	public StopWords() {
		// Stopwords list
		stopWordlst.add("'ah");
		stopWordlst.add("a");
		stopWordlst.add("able");
		stopWordlst.add("about");
		stopWordlst.add("above");
		stopWordlst.add("according");
		stopWordlst.add("accordingly");
		stopWordlst.add("across");
		stopWordlst.add("actually");
		stopWordlst.add("after");
		stopWordlst.add("afterwards");
		stopWordlst.add("again");
		stopWordlst.add("against");
		stopWordlst.add("all");
		stopWordlst.add("allow");
		stopWordlst.add("allows");
		stopWordlst.add("almost");
		stopWordlst.add("alone");
		stopWordlst.add("along");
		stopWordlst.add("already");
		stopWordlst.add("also");
		stopWordlst.add("although");
		stopWordlst.add("always");
		stopWordlst.add("am");
		stopWordlst.add("among");
		stopWordlst.add("amongst");
		stopWordlst.add("an");
		stopWordlst.add("and");
		stopWordlst.add("another");
		stopWordlst.add("any");
		stopWordlst.add("anybody");
		stopWordlst.add("anyhow");
		stopWordlst.add("anyone");
		stopWordlst.add("anything");
		stopWordlst.add("anyway");
		stopWordlst.add("anyways");
		stopWordlst.add("anywhere");
		stopWordlst.add("apart");
		stopWordlst.add("appear");
		stopWordlst.add("appropriate");
		stopWordlst.add("are");
		stopWordlst.add("around");
		stopWordlst.add("as");
		stopWordlst.add("aside");
		stopWordlst.add("ask");
		stopWordlst.add("asking");
		stopWordlst.add("associated");
		stopWordlst.add("at");
		stopWordlst.add("available");
		stopWordlst.add("away");
		stopWordlst.add("awfully");
		stopWordlst.add("b");
		stopWordlst.add("be");
		stopWordlst.add("became");
		stopWordlst.add("because");
		stopWordlst.add("become");
		stopWordlst.add("becomes");
		stopWordlst.add("becoming");
		stopWordlst.add("been");
		stopWordlst.add("before");
		stopWordlst.add("beforehand");
		stopWordlst.add("behind");
		stopWordlst.add("being");
		stopWordlst.add("believe");
		stopWordlst.add("below");
		stopWordlst.add("beside");
		stopWordlst.add("besides");
		stopWordlst.add("best");
		stopWordlst.add("better");
		stopWordlst.add("between");
		stopWordlst.add("beyond");
		stopWordlst.add("both");
		stopWordlst.add("brief");
		stopWordlst.add("but");
		stopWordlst.add("by");
		stopWordlst.add("c");
		stopWordlst.add("came");
		stopWordlst.add("can");
		stopWordlst.add("cannot");
		stopWordlst.add("cant");
		stopWordlst.add("cause");
		stopWordlst.add("causes");
		stopWordlst.add("certain");
		stopWordlst.add("certainly");
		stopWordlst.add("changes");
		stopWordlst.add("clearly");
		stopWordlst.add("co");
		stopWordlst.add("com");
		stopWordlst.add("come");
		stopWordlst.add("comes");
		stopWordlst.add("concerning");
		stopWordlst.add("consequently");
		stopWordlst.add("consider");
		stopWordlst.add("considering");
		stopWordlst.add("contain");
		stopWordlst.add("containing");
		stopWordlst.add("contains");
		stopWordlst.add("corresponding");
		stopWordlst.add("could");
		stopWordlst.add("course");
		stopWordlst.add("currently");
		stopWordlst.add("d");
		stopWordlst.add("definitely");
		stopWordlst.add("described");
		stopWordlst.add("despite");
		stopWordlst.add("did");
		stopWordlst.add("different");
		stopWordlst.add("do");
		stopWordlst.add("does");
		stopWordlst.add("doing");
		stopWordlst.add("done");
		stopWordlst.add("down");
		stopWordlst.add("downwards");
		stopWordlst.add("during");
		stopWordlst.add("e");
		stopWordlst.add("each");
		stopWordlst.add("edu");
		stopWordlst.add("eg");
		stopWordlst.add("either");
		stopWordlst.add("else");
		stopWordlst.add("elsewhere");
		stopWordlst.add("enough");
		stopWordlst.add("entirely");
		stopWordlst.add("especially");
		stopWordlst.add("et");
		stopWordlst.add("etc");
		stopWordlst.add("even");
		stopWordlst.add("ever");
		stopWordlst.add("every");
		stopWordlst.add("everybody");
		stopWordlst.add("everyone");
		stopWordlst.add("everything");
		stopWordlst.add("everywhere");
		stopWordlst.add("ex");
		stopWordlst.add("exactly");
		stopWordlst.add("example");
		stopWordlst.add("except");
		stopWordlst.add("f");
		stopWordlst.add("far");
		stopWordlst.add("few");
		stopWordlst.add("followed");
		stopWordlst.add("following");
		stopWordlst.add("follows");
		stopWordlst.add("for");
		stopWordlst.add("formal");
		stopWordlst.add("former");
		stopWordlst.add("formerly");
		stopWordlst.add("forth");
		stopWordlst.add("four");
		stopWordlst.add("from");
		stopWordlst.add("further");
		stopWordlst.add("furthermore");
		stopWordlst.add("g");
		stopWordlst.add("get");
		stopWordlst.add("gets");
		stopWordlst.add("getting");
		stopWordlst.add("given");
		stopWordlst.add("gives");
		stopWordlst.add("go");
		stopWordlst.add("goes");
		stopWordlst.add("going");
		stopWordlst.add("gone");
		stopWordlst.add("got");
		stopWordlst.add("gotten");
		stopWordlst.add("greetings");
		stopWordlst.add("h");
		stopWordlst.add("had");
		stopWordlst.add("happens");
		stopWordlst.add("hardly");
		stopWordlst.add("has");
		stopWordlst.add("have");
		stopWordlst.add("having");
		stopWordlst.add("he");
		stopWordlst.add("hello");
		stopWordlst.add("help");
		stopWordlst.add("hence");
		stopWordlst.add("her");
		stopWordlst.add("here");
		stopWordlst.add("hereafter");
		stopWordlst.add("hereby");
		stopWordlst.add("herein");
		stopWordlst.add("hereupon");
		stopWordlst.add("hers");
		stopWordlst.add("herself");
		stopWordlst.add("hi");
		stopWordlst.add("him");
		stopWordlst.add("himself");
		stopWordlst.add("his");
		stopWordlst.add("hither");
		stopWordlst.add("hopefully");
		stopWordlst.add("how");
		stopWordlst.add("howbeit");
		stopWordlst.add("however");
		stopWordlst.add("i");
		stopWordlst.add("ie");
		stopWordlst.add("if");
		stopWordlst.add("ignored");
		stopWordlst.add("immediate");
		stopWordlst.add("in");
		stopWordlst.add("inasmuch");
		stopWordlst.add("inc");
		stopWordlst.add("indeed");
		stopWordlst.add("indicate");
		stopWordlst.add("indicated");
		stopWordlst.add("indicates");
		stopWordlst.add("inner");
		stopWordlst.add("insofar");
		stopWordlst.add("instead");
		stopWordlst.add("into");
		stopWordlst.add("inward");
		stopWordlst.add("is");
		stopWordlst.add("it");
		stopWordlst.add("its");
		stopWordlst.add("itself");
		stopWordlst.add("j");
		stopWordlst.add("just");
		stopWordlst.add("k");
		stopWordlst.add("keep");
		stopWordlst.add("keeps");
		stopWordlst.add("kept");
		stopWordlst.add("kind");
		stopWordlst.add("know");
		stopWordlst.add("knows");
		stopWordlst.add("known");
		stopWordlst.add("l");
		stopWordlst.add("lately");
		stopWordlst.add("later");
		stopWordlst.add("latter");
		stopWordlst.add("latterly");
		stopWordlst.add("least");
		stopWordlst.add("less");
		stopWordlst.add("lest");
		stopWordlst.add("let");
		stopWordlst.add("like");
		stopWordlst.add("liked");
		stopWordlst.add("likely");
		stopWordlst.add("little");
		stopWordlst.add("ll"); // stopWordlst.added to avoid words like
								// you'll,I'll etc.
		stopWordlst.add("look");
		stopWordlst.add("looking");
		stopWordlst.add("looks");
		stopWordlst.add("ltd");
		stopWordlst.add("m");
		stopWordlst.add("mainly");
		stopWordlst.add("many");
		stopWordlst.add("may");
		stopWordlst.add("maybe");
		stopWordlst.add("me");
		stopWordlst.add("mean");
		stopWordlst.add("meanwhile");
		stopWordlst.add("merely");
		stopWordlst.add("might");
		stopWordlst.add("more");
		stopWordlst.add("moreover");
		stopWordlst.add("most");
		stopWordlst.add("mostly");
		stopWordlst.add("much");
		stopWordlst.add("must");
		stopWordlst.add("my");
		stopWordlst.add("myself");
		stopWordlst.add("n");
		stopWordlst.add("name");
		stopWordlst.add("namely");
		stopWordlst.add("nd");
		stopWordlst.add("near");
		stopWordlst.add("nearly");
		stopWordlst.add("necessary");
		stopWordlst.add("need");
		stopWordlst.add("needs");
		stopWordlst.add("neither");
		stopWordlst.add("never");
		stopWordlst.add("nevertheless");
		stopWordlst.add("new");
		stopWordlst.add("next");
		stopWordlst.add("nine");
		stopWordlst.add("no");
		stopWordlst.add("nobody");
		stopWordlst.add("non");
		stopWordlst.add("none");
		stopWordlst.add("noone");
		stopWordlst.add("nor");
		stopWordlst.add("normally");
		stopWordlst.add("not");
		stopWordlst.add("nothing");
		stopWordlst.add("now");
		stopWordlst.add("nowhere");
		stopWordlst.add("o");
		stopWordlst.add("obviously");
		stopWordlst.add("of");
		stopWordlst.add("off");
		stopWordlst.add("often");
		stopWordlst.add("oh");
		stopWordlst.add("ok");
		stopWordlst.add("okay");
		stopWordlst.add("old");
		stopWordlst.add("on");
		stopWordlst.add("once");
		stopWordlst.add("one");
		stopWordlst.add("ones");
		stopWordlst.add("only");
		stopWordlst.add("onto");
		stopWordlst.add("or");
		stopWordlst.add("other");
		stopWordlst.add("others");
		stopWordlst.add("otherwise");
		stopWordlst.add("ought");
		stopWordlst.add("our");
		stopWordlst.add("ours");
		stopWordlst.add("ourselves");
		stopWordlst.add("out");
		stopWordlst.add("outside");
		stopWordlst.add("over");
		stopWordlst.add("overall");
		stopWordlst.add("own");
		stopWordlst.add("p");
		stopWordlst.add("particular");
		stopWordlst.add("particularly");
		stopWordlst.add("per");
		stopWordlst.add("perhaps");
		stopWordlst.add("place");
		stopWordlst.add("placed");
		stopWordlst.add("play");
		stopWordlst.add("please");
		stopWordlst.add("plus");
		stopWordlst.add("possible");
		stopWordlst.add("presumably");
		stopWordlst.add("probably");
		stopWordlst.add("provides");
		stopWordlst.add("q");
		stopWordlst.add("que");
		stopWordlst.add("quite");
		stopWordlst.add("qv");
		stopWordlst.add("r");
		stopWordlst.add("rather");
		stopWordlst.add("rd");
		stopWordlst.add("re");
		stopWordlst.add("really");
		stopWordlst.add("reasonably");
		stopWordlst.add("regarding");
		stopWordlst.add("regardless");
		stopWordlst.add("regards");
		stopWordlst.add("relatively");
		stopWordlst.add("respectively");
		stopWordlst.add("right");
		stopWordlst.add("s");
		stopWordlst.add("said");
		stopWordlst.add("same");
		stopWordlst.add("saw");
		stopWordlst.add("say");
		stopWordlst.add("saying");
		stopWordlst.add("says");
		stopWordlst.add("second");
		stopWordlst.add("secondly");
		stopWordlst.add("see");
		stopWordlst.add("seeing");
		stopWordlst.add("seem");
		stopWordlst.add("seemed");
		stopWordlst.add("seeming");
		stopWordlst.add("seems");
		stopWordlst.add("seen");
		stopWordlst.add("self");
		stopWordlst.add("selves");
		stopWordlst.add("sensible");
		stopWordlst.add("sent");
		stopWordlst.add("serious");
		stopWordlst.add("seriously");
		stopWordlst.add("seven");
		stopWordlst.add("several");
		stopWordlst.add("shall");
		stopWordlst.add("she");
		stopWordlst.add("should");
		stopWordlst.add("since");
		stopWordlst.add("six");
		stopWordlst.add("so");
		stopWordlst.add("some");
		stopWordlst.add("somebody");
		stopWordlst.add("somehow");
		stopWordlst.add("someone");
		stopWordlst.add("something");
		stopWordlst.add("sometime");
		stopWordlst.add("sometimes");
		stopWordlst.add("somewhat");
		stopWordlst.add("somewhere");
		stopWordlst.add("soon");
		stopWordlst.add("sorry");
		stopWordlst.add("specified");
		stopWordlst.add("specify");
		stopWordlst.add("specifying");
		stopWordlst.add("still");
		stopWordlst.add("sub");
		stopWordlst.add("such");
		stopWordlst.add("sup");
		stopWordlst.add("sure");
		stopWordlst.add("t");
		stopWordlst.add("take");
		stopWordlst.add("taken");
		stopWordlst.add("tell");
		stopWordlst.add("tends");
		stopWordlst.add("term");
		stopWordlst.add("th");
		stopWordlst.add("than");
		stopWordlst.add("thank");
		stopWordlst.add("thanks");
		stopWordlst.add("thanx");
		stopWordlst.add("that");
		stopWordlst.add("thats");
		stopWordlst.add("the");
		stopWordlst.add("their");
		stopWordlst.add("theirs");
		stopWordlst.add("them");
		stopWordlst.add("themselves");
		stopWordlst.add("then");
		stopWordlst.add("thence");
		stopWordlst.add("there");
		stopWordlst.add("thereafter");
		stopWordlst.add("thereby");
		stopWordlst.add("therefore");
		stopWordlst.add("therein");
		stopWordlst.add("theres");
		stopWordlst.add("thereupon");
		stopWordlst.add("these");
		stopWordlst.add("they");
		stopWordlst.add("think");
		stopWordlst.add("third");
		stopWordlst.add("this");
		stopWordlst.add("thorough");
		stopWordlst.add("thoroughly");
		stopWordlst.add("those");
		stopWordlst.add("though");
		stopWordlst.add("three");
		stopWordlst.add("through");
		stopWordlst.add("throughout");
		stopWordlst.add("thru");
		stopWordlst.add("thus");
		stopWordlst.add("to");
		stopWordlst.add("together");
		stopWordlst.add("too");
		stopWordlst.add("took");
		stopWordlst.add("toward");
		stopWordlst.add("towards");
		stopWordlst.add("tried");
		stopWordlst.add("tries");
		stopWordlst.add("truly");
		stopWordlst.add("try");
		stopWordlst.add("trying");
		stopWordlst.add("twice");
		stopWordlst.add("two");
		stopWordlst.add("type");
		stopWordlst.add("u");
		stopWordlst.add("un");
		stopWordlst.add("under");
		stopWordlst.add("unfortunately");
		stopWordlst.add("unless");
		stopWordlst.add("unlikely");
		stopWordlst.add("until");
		stopWordlst.add("unto");
		stopWordlst.add("up");
		stopWordlst.add("upon");
		stopWordlst.add("us");
		stopWordlst.add("use");
		stopWordlst.add("used");
		stopWordlst.add("useful");
		stopWordlst.add("uses");
		stopWordlst.add("using");
		stopWordlst.add("usually");
		stopWordlst.add("uucp");
		stopWordlst.add("v");
		stopWordlst.add("value");
		stopWordlst.add("various");
		// stopWordlst.added to avoid words like I've,you've etc.

		stopWordlst.add("ve");
		stopWordlst.add("very");
		stopWordlst.add("via");
		stopWordlst.add("viz");
		stopWordlst.add("vs");
		stopWordlst.add("w");
		stopWordlst.add("want");
		stopWordlst.add("wants");
		stopWordlst.add("was");
		stopWordlst.add("way");
		stopWordlst.add("we");
		stopWordlst.add("welcome");
		stopWordlst.add("well");
		stopWordlst.add("went");
		stopWordlst.add("were");
		stopWordlst.add("what");
		stopWordlst.add("whatever");
		stopWordlst.add("when");
		stopWordlst.add("whence");
		stopWordlst.add("whenever");
		stopWordlst.add("where");
		stopWordlst.add("whereafter");
		stopWordlst.add("whereas");
		stopWordlst.add("whereby");
		stopWordlst.add("wherein");
		stopWordlst.add("whereupon");
		stopWordlst.add("wherever");
		stopWordlst.add("whether");
		stopWordlst.add("which");
		stopWordlst.add("while");
		stopWordlst.add("whither");
		stopWordlst.add("who");
		stopWordlst.add("whoever");
		stopWordlst.add("whole");
		stopWordlst.add("whom");
		stopWordlst.add("whose");
		stopWordlst.add("why");
		stopWordlst.add("will");
		stopWordlst.add("willing");
		stopWordlst.add("wish");
		stopWordlst.add("with");
		stopWordlst.add("within");
		stopWordlst.add("without");
		stopWordlst.add("wonder");
		stopWordlst.add("would");
		stopWordlst.add("would");
		stopWordlst.add("x");
		stopWordlst.add("y");
		stopWordlst.add("yes");
		stopWordlst.add("yet");
		stopWordlst.add("you");
		stopWordlst.add("your");
		stopWordlst.add("yours");
		stopWordlst.add("yourself");
		stopWordlst.add("yourselves");
		stopWordlst.add("z");
		/******************** added by me ********************/
		stopWordlst.add("how-to");
		stopWordlst.add("downloads");
		stopWordlst.add("pdf");
		stopWordlst.add("word");
		stopWordlst.add("slides");
		stopWordlst.add("photo");
		stopWordlst.add("step-by-step");

	}

	public boolean ContainsSW(String word) {

		return stopWordlst.contains(word);

	}
}