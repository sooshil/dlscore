package com.sukajee.dlscore.data.models

import com.google.gson.annotations.SerializedName

data class ResourcesResponse(
    val data: Data?
)

data class Data(
    val oversLeft: List<List<Double>>?
)

data class OversLeft(
    @SerializedName("0")
    val zero: List<Float>? = null,
    @SerializedName("0.1")
    val zeroPointOne: List<Float>? = null,
    @SerializedName("0.2")
    val zeroPointTwo: List<Float>? = null,
    @SerializedName("0.3")
    val zeroPointThree: List<Float>? = null,
    @SerializedName("0.4")
    val zeroPointFour: List<Float>? = null,
    @SerializedName("0.5")
    val zeroPointFive: List<Float>? = null,
    @SerializedName("1")
    val one: List<Float>? = null,
    @SerializedName("1.1")
    val onePointOne: List<Float>? = null,
    @SerializedName("1.2")
    val onePointTwo: List<Float>? = null,
    @SerializedName("1.3")
    val onePointThree: List<Float>? = null,
    @SerializedName("1.4")
    val onePointFour: List<Float>? = null,
    @SerializedName("1.5")
    val onePointFive: List<Float>? = null,
    @SerializedName("2")
    val two: List<Float>? = null,
    @SerializedName("2.1")
    val twoPointOne: List<Float>? = null,
    @SerializedName("2.2")
    val twoPointTwo: List<Float>? = null,
    @SerializedName("2.3")
    val twoPointThree: List<Float>? = null,
    @SerializedName("2.4")
    val twoPointFour: List<Float>? = null,
    @SerializedName("2.5")
    val twoPointFive: List<Float>? = null,
    @SerializedName("3")
    val three: List<Float>? = null,
    @SerializedName("3.1")
    val threePointOne: List<Float>? = null,
    @SerializedName("3.2")
    val threePointTwo: List<Float>? = null,
    @SerializedName("3.3")
    val threePointThree: List<Float>? = null,
    @SerializedName("3.4")
    val threePointFour: List<Float>? = null,
    @SerializedName("3.5")
    val threePointFive: List<Float>? = null,
    @SerializedName("4")
    val four: List<Float>? = null,
    @SerializedName("4.1")
    val fourPointOne: List<Float>? = null,
    @SerializedName("4.2")
    val fourPointTwo: List<Float>? = null,
    @SerializedName("4.3")
    val fourPointThree: List<Float>? = null,
    @SerializedName("4.4")
    val fourPointFour: List<Float>? = null,
    @SerializedName("4.5")
    val fourPointFive: List<Float>? = null,
    @SerializedName("5")
    val five: List<Float>? = null,
    @SerializedName("5.1")
    val fivePointOne: List<Float>? = null,
    @SerializedName("5.2")
    val fivePointTwo: List<Float>? = null,
    @SerializedName("5.3")
    val fivePointThree: List<Float>? = null,
    @SerializedName("5.4")
    val fivePointFour: List<Float>? = null,
    @SerializedName("5.5")
    val fivePointFive: List<Float>? = null,
    @SerializedName("6")
    val six: List<Float>? = null,
    @SerializedName("6.1")
    val sixPointOne: List<Float>? = null,
    @SerializedName("6.2")
    val sixPointTwo: List<Float>? = null,
    @SerializedName("6.3")
    val sixPointThree: List<Float>? = null,
    @SerializedName("6.4")
    val sixPointFour: List<Float>? = null,
    @SerializedName("6.5")
    val sixPointFive: List<Float>? = null,
    @SerializedName("7")
    val seven: List<Float>? = null,
    @SerializedName("7.1")
    val sevenPointOne: List<Float>? = null,
    @SerializedName("7.2")
    val sevenPointTwo: List<Float>? = null,
    @SerializedName("7.3")
    val sevenPointThree: List<Float>? = null,
    @SerializedName("7.4")
    val sevenPointFour: List<Float>? = null,
    @SerializedName("7.5")
    val sevenPointFive: List<Float>? = null,
    @SerializedName("8")
    val eight: List<Float>? = null,
    @SerializedName("8.1")
    val eightPointOne: List<Float>? = null,
    @SerializedName("8.2")
    val eightPointTwo: List<Float>? = null,
    @SerializedName("8.3")
    val eightPointThree: List<Float>? = null,
    @SerializedName("8.4")
    val eightPointFour: List<Float>? = null,
    @SerializedName("8.5")
    val eightPointFive: List<Float>? = null,
    @SerializedName("9")
    val nine: List<Float>? = null,
    @SerializedName("9.1")
    val ninePointOne: List<Float>? = null,
    @SerializedName("9.2")
    val ninePointTwo: List<Float>? = null,
    @SerializedName("9.3")
    val ninePointThree: List<Float>? = null,
    @SerializedName("9.4")
    val ninePointFour: List<Float>? = null,
    @SerializedName("9.5")
    val ninePointFive: List<Float>? = null,
    @SerializedName("10")
    val ten: List<Float>? = null,
    @SerializedName("10.1")
    val tenPointOne: List<Float>? = null,
    @SerializedName("10.2")
    val tenPointTwo: List<Float>? = null,
    @SerializedName("10.3")
    val tenPointThree: List<Float>? = null,
    @SerializedName("10.4")
    val tenPointFour: List<Float>? = null,
    @SerializedName("10.5")
    val tenPointFive: List<Float>? = null,
    @SerializedName("11")
    val eleven: List<Float>? = null,
    @SerializedName("11.1")
    val elevenPointOne: List<Float>? = null,
    @SerializedName("11.2")
    val elevenPointTwo: List<Float>? = null,
    @SerializedName("11.3")
    val elevenPointThree: List<Float>? = null,
    @SerializedName("11.4")
    val elevenPointFour: List<Float>? = null,
    @SerializedName("11.5")
    val elevenPointFive: List<Float>? = null,
    @SerializedName("12")
    val twelve: List<Float>? = null,
    @SerializedName("12.1")
    val twelvePointOne: List<Float>? = null,
    @SerializedName("12.2")
    val twelvePointTwo: List<Float>? = null,
    @SerializedName("12.3")
    val twelvePointThree: List<Float>? = null,
    @SerializedName("12.4")
    val twelvePointFour: List<Float>? = null,
    @SerializedName("12.5")
    val twelvePointFive: List<Float>? = null,
    @SerializedName("13")
    val thirteen: List<Float>? = null,
    @SerializedName("13.1")
    val thirteenPointOne: List<Float>? = null,
    @SerializedName("13.2")
    val thirteenPointTwo: List<Float>? = null,
    @SerializedName("13.3")
    val thirteenPointThree: List<Float>? = null,
    @SerializedName("13.4")
    val thirteenPointFour: List<Float>? = null,
    @SerializedName("13.5")
    val thirteenPointFive: List<Float>? = null,
    @SerializedName("14")
    val fourteen: List<Float>? = null,
    @SerializedName("14.1")
    val fourteenPointOne: List<Float>? = null,
    @SerializedName("14.2")
    val fourteenPointTwo: List<Float>? = null,
    @SerializedName("14.3")
    val fourteenPointThree: List<Float>? = null,
    @SerializedName("14.4")
    val fourteenPointFour: List<Float>? = null,
    @SerializedName("14.5")
    val fourteenPointFive: List<Float>? = null,
    @SerializedName("15")
    val fifteen: List<Float>? = null,
    @SerializedName("15.1")
    val fifteenPointOne: List<Float>? = null,
    @SerializedName("15.2")
    val fifteenPointTwo: List<Float>? = null,
    @SerializedName("15.3")
    val fifteenPointThree: List<Float>? = null,
    @SerializedName("15.4")
    val fifteenPointFour: List<Float>? = null,
    @SerializedName("15.5")
    val fifteenPointFive: List<Float>? = null,
    @SerializedName("16")
    val sixteen: List<Float>? = null,
    @SerializedName("16.1")
    val sixteenPointOne: List<Float>? = null,
    @SerializedName("16.2")
    val sixteenPointTwo: List<Float>? = null,
    @SerializedName("16.3")
    val sixteenPointThree: List<Float>? = null,
    @SerializedName("16.4")
    val sixteenPointFour: List<Float>? = null,
    @SerializedName("16.5")
    val sixteenPointFive: List<Float>? = null,
    @SerializedName("17")
    val seventeen: List<Float>? = null,
    @SerializedName("17.1")
    val seventeenPointOne: List<Float>? = null,
    @SerializedName("17.2")
    val seventeenPointTwo: List<Float>? = null,
    @SerializedName("17.3")
    val seventeenPointThree: List<Float>? = null,
    @SerializedName("17.4")
    val seventeenPointFour: List<Float>? = null,
    @SerializedName("17.5")
    val seventeenPointFive: List<Float>? = null,
    @SerializedName("18")
    val eighteen: List<Float>? = null,
    @SerializedName("18.1")
    val eighteenPointOne: List<Float>? = null,
    @SerializedName("18.2")
    val eighteenPointTwo: List<Float>? = null,
    @SerializedName("18.3")
    val eighteenPointThree: List<Float>? = null,
    @SerializedName("18.4")
    val eighteenPointFour: List<Float>? = null,
    @SerializedName("18.5")
    val eighteenPointFive: List<Float>? = null,
    @SerializedName("19")
    val nineteen: List<Float>? = null,
    @SerializedName("19.1")
    val nineteenPointOne: List<Float>? = null,
    @SerializedName("19.2")
    val nineteenPointTwo: List<Float>? = null,
    @SerializedName("19.3")
    val nineteenPointThree: List<Float>? = null,
    @SerializedName("19.4")
    val nineteenPointFour: List<Float>? = null,
    @SerializedName("19.5")
    val nineteenPointFive: List<Float>? = null,
    @SerializedName("20")
    val twenty: List<Float>? = null,
    @SerializedName("20.1")
    val twentyPointOne: List<Float>? = null,
    @SerializedName("20.2")
    val twentyPointTwo: List<Float>? = null,
    @SerializedName("20.3")
    val twentyPointThree: List<Float>? = null,
    @SerializedName("20.4")
    val twentyPointFour: List<Float>? = null,
    @SerializedName("20.5")
    val twentyPointFive: List<Float>? = null,
    @SerializedName("21")
    val twentyOne: List<Float>? = null,
    @SerializedName("21.1")
    val twentyOnePointOne: List<Float>? = null,
    @SerializedName("21.2")
    val twentyOnePointTwo: List<Float>? = null,
    @SerializedName("21.3")
    val twentyOnePointThree: List<Float>? = null,
    @SerializedName("21.4")
    val twentyOnePointFour: List<Float>? = null,
    @SerializedName("21.5")
    val twentyOnePointFive: List<Float>? = null,
    @SerializedName("22")
    val twentyTwo: List<Float>? = null,
    @SerializedName("22.1")
    val twentyTwoPointOne: List<Float>? = null,
    @SerializedName("22.2")
    val twentyTwoPointTwo: List<Float>? = null,
    @SerializedName("22.3")
    val twentyTwoPointThree: List<Float>? = null,
    @SerializedName("22.4")
    val twentyTwoPointFour: List<Float>? = null,
    @SerializedName("22.5")
    val twentyTwoPointFive: List<Float>? = null,
    @SerializedName("23")
    val twentyThree: List<Float>? = null,
    @SerializedName("23.1")
    val twentyThreePointOne: List<Float>? = null,
    @SerializedName("23.2")
    val twentyThreePointTwo: List<Float>? = null,
    @SerializedName("23.3")
    val twentyThreePointThree: List<Float>? = null,
    @SerializedName("23.4")
    val twentyThreePointFour: List<Float>? = null,
    @SerializedName("23.5")
    val twentyThreePointFive: List<Float>? = null,
    @SerializedName("24")
    val twentyFour: List<Float>? = null,
    @SerializedName("24.1")
    val twentyFourPointOne: List<Float>? = null,
    @SerializedName("24.2")
    val twentyFourPointTwo: List<Float>? = null,
    @SerializedName("24.3")
    val twentyFourPointThree: List<Float>? = null,
    @SerializedName("24.4")
    val twentyFourPointFour: List<Float>? = null,
    @SerializedName("24.5")
    val twentyFourPointFive: List<Float>? = null,
    @SerializedName("25")
    val twentyFive: List<Float>? = null,
    @SerializedName("25.1")
    val twentyFivePointOne: List<Float>? = null,
    @SerializedName("25.2")
    val twentyFivePointTwo: List<Float>? = null,
    @SerializedName("25.3")
    val twentyFivePointThree: List<Float>? = null,
    @SerializedName("25.4")
    val twentyFivePointFour: List<Float>? = null,
    @SerializedName("25.5")
    val twentyFivePointFive: List<Float>? = null,
    @SerializedName("26")
    val twentySix: List<Float>? = null,
    @SerializedName("26.1")
    val twentySixPointOne: List<Float>? = null,
    @SerializedName("26.2")
    val twentySixPointTwo: List<Float>? = null,
    @SerializedName("26.3")
    val twentySixPointThree: List<Float>? = null,
    @SerializedName("26.4")
    val twentySixPointFour: List<Float>? = null,
    @SerializedName("26.5")
    val twentySixPointFive: List<Float>? = null,
    @SerializedName("27")
    val twentySeven: List<Float>? = null,
    @SerializedName("27.1")
    val twentySevenPointOne: List<Float>? = null,
    @SerializedName("27.2")
    val twentySevenPointTwo: List<Float>? = null,
    @SerializedName("27.3")
    val twentySevenPointThree: List<Float>? = null,
    @SerializedName("27.4")
    val twentySevenPointFour: List<Float>? = null,
    @SerializedName("27.5")
    val twentySevenPointFive: List<Float>? = null,
    @SerializedName("28")
    val twentyEight: List<Float>? = null,
    @SerializedName("28.1")
    val twentyEightPointOne: List<Float>? = null,
    @SerializedName("28.2")
    val twentyEightPointTwo: List<Float>? = null,
    @SerializedName("28.3")
    val twentyEightPointThree: List<Float>? = null,
    @SerializedName("28.4")
    val twentyEightPointFour: List<Float>? = null,
    @SerializedName("28.5")
    val twentyEightPointFive: List<Float>? = null,
    @SerializedName("29")
    val twentyNine: List<Float>? = null,
    @SerializedName("29.1")
    val twentyNinePointOne: List<Float>? = null,
    @SerializedName("29.2")
    val twentyNinePointTwo: List<Float>? = null,
    @SerializedName("29.3")
    val twentyNinePointThree: List<Float>? = null,
    @SerializedName("29.4")
    val twentyNinePointFour: List<Float>? = null,
    @SerializedName("29.5")
    val twentyNinePointFive: List<Float>? = null,
    @SerializedName("30")
    val thirty: List<Float>? = null,
    @SerializedName("30.1")
    val thirtyPointOne: List<Float>? = null,
    @SerializedName("30.2")
    val thirtyPointTwo: List<Float>? = null,
    @SerializedName("30.3")
    val thirtyPointThree: List<Float>? = null,
    @SerializedName("30.4")
    val thirtyPointFour: List<Float>? = null,
    @SerializedName("30.5")
    val thirtyPointFive: List<Float>? = null,
    @SerializedName("31")
    val thirtyOne: List<Float>? = null,
    @SerializedName("31.1")
    val thirtyOnePointOne: List<Float>? = null,
    @SerializedName("31.2")
    val thirtyOnePointTwo: List<Float>? = null,
    @SerializedName("31.3")
    val thirtyOnePointThree: List<Float>? = null,
    @SerializedName("31.4")
    val thirtyOnePointFour: List<Float>? = null,
    @SerializedName("31.5")
    val thirtyOnePointFive: List<Float>? = null,
    @SerializedName("32")
    val thirtyTwo: List<Float>? = null,
    @SerializedName("32.1")
    val thirtyTwoPointOne: List<Float>? = null,
    @SerializedName("32.2")
    val thirtyTwoPointTwo: List<Float>? = null,
    @SerializedName("32.3")
    val thirtyTwoPointThree: List<Float>? = null,
    @SerializedName("32.4")
    val thirtyTwoPointFour: List<Float>? = null,
    @SerializedName("32.5")
    val thirtyTwoPointFive: List<Float>? = null,
    @SerializedName("33")
    val thirtyThree: List<Float>? = null,
    @SerializedName("33.1")
    val thirtyThreePointOne: List<Float>? = null,
    @SerializedName("33.2")
    val thirtyThreePointTwo: List<Float>? = null,
    @SerializedName("33.3")
    val thirtyThreePointThree: List<Float>? = null,
    @SerializedName("33.4")
    val thirtyThreePointFour: List<Float>? = null,
    @SerializedName("33.5")
    val thirtyThreePointFive: List<Float>? = null,
    @SerializedName("34")
    val thirtyFour: List<Float>? = null,
    @SerializedName("34.1")
    val thirtyFourPointOne: List<Float>? = null,
    @SerializedName("34.2")
    val thirtyFourPointTwo: List<Float>? = null,
    @SerializedName("34.3")
    val thirtyFourPointThree: List<Float>? = null,
    @SerializedName("34.4")
    val thirtyFourPointFour: List<Float>? = null,
    @SerializedName("34.5")
    val thirtyFourPointFive: List<Float>? = null,
    @SerializedName("35")
    val thirtyFive: List<Float>? = null,
    @SerializedName("35.1")
    val thirtyFivePointOne: List<Float>? = null,
    @SerializedName("35.2")
    val thirtyFivePointTwo: List<Float>? = null,
    @SerializedName("35.3")
    val thirtyFivePointThree: List<Float>? = null,
    @SerializedName("35.4")
    val thirtyFivePointFour: List<Float>? = null,
    @SerializedName("35.5")
    val thirtyFivePointFive: List<Float>? = null,
    @SerializedName("36")
    val thirtySix: List<Float>? = null,
    @SerializedName("36.1")
    val thirtySixPointOne: List<Float>? = null,
    @SerializedName("36.2")
    val thirtySixPointTwo: List<Float>? = null,
    @SerializedName("36.3")
    val thirtySixPointThree: List<Float>? = null,
    @SerializedName("36.4")
    val thirtySixPointFour: List<Float>? = null,
    @SerializedName("36.5")
    val thirtySixPointFive: List<Float>? = null,
    @SerializedName("37")
    val thirtySeven: List<Float>? = null,
    @SerializedName("37.1")
    val thirtySevenPointOne: List<Float>? = null,
    @SerializedName("37.2")
    val thirtySevenPointTwo: List<Float>? = null,
    @SerializedName("37.3")
    val thirtySevenPointThree: List<Float>? = null,
    @SerializedName("37.4")
    val thirtySevenPointFour: List<Float>? = null,
    @SerializedName("37.5")
    val thirtySevenPointFive: List<Float>? = null,
    @SerializedName("38")
    val thirtyEight: List<Float>? = null,
    @SerializedName("38.1")
    val thirtyEightPointOne: List<Float>? = null,
    @SerializedName("38.2")
    val thirtyEightPointTwo: List<Float>? = null,
    @SerializedName("38.3")
    val thirtyEightPointThree: List<Float>? = null,
    @SerializedName("38.4")
    val thirtyEightPointFour: List<Float>? = null,
    @SerializedName("38.5")
    val thirtyEightPointFive: List<Float>? = null,
    @SerializedName("39")
    val thirtyNine: List<Float>? = null,
    @SerializedName("39.1")
    val thirtyNinePointOne: List<Float>? = null,
    @SerializedName("39.2")
    val thirtyNinePointTwo: List<Float>? = null,
    @SerializedName("39.3")
    val thirtyNinePointThree: List<Float>? = null,
    @SerializedName("39.4")
    val thirtyNinePointFour: List<Float>? = null,
    @SerializedName("39.5")
    val thirtyNinePointFive: List<Float>? = null,
    @SerializedName("40")
    val forty: List<Float>? = null,
    @SerializedName("40.1")
    val fortyPointOne: List<Float>? = null,
    @SerializedName("40.2")
    val fortyPointTwo: List<Float>? = null,
    @SerializedName("40.3")
    val fortyPointThree: List<Float>? = null,
    @SerializedName("40.4")
    val fortyPointFour: List<Float>? = null,
    @SerializedName("40.5")
    val fortyPointFive: List<Float>? = null,
    @SerializedName("41")
    val fortyOne: List<Float>? = null,
    @SerializedName("41.1")
    val fortyOnePointOne: List<Float>? = null,
    @SerializedName("41.2")
    val fortyOnePointTwo: List<Float>? = null,
    @SerializedName("41.3")
    val fortyOnePointThree: List<Float>? = null,
    @SerializedName("41.4")
    val fortyOnePointFour: List<Float>? = null,
    @SerializedName("41.5")
    val fortyOnePointFive: List<Float>? = null,
    @SerializedName("42")
    val fortyTwo: List<Float>? = null,
    @SerializedName("42.1")
    val fortyTwoPointOne: List<Float>? = null,
    @SerializedName("42.2")
    val fortyTwoPointTwo: List<Float>? = null,
    @SerializedName("42.3")
    val fortyTwoPointThree: List<Float>? = null,
    @SerializedName("42.4")
    val fortyTwoPointFour: List<Float>? = null,
    @SerializedName("42.5")
    val fortyTwoPointFive: List<Float>? = null,
    @SerializedName("43")
    val fortyThree: List<Float>? = null,
    @SerializedName("43.1")
    val fortyThreePointOne: List<Float>? = null,
    @SerializedName("43.2")
    val fortyThreePointTwo: List<Float>? = null,
    @SerializedName("43.3")
    val fortyThreePointThree: List<Float>? = null,
    @SerializedName("43.4")
    val fortyThreePointFour: List<Float>? = null,
    @SerializedName("43.5")
    val fortyThreePointFive: List<Float>? = null,
    @SerializedName("44")
    val fortyFour: List<Float>? = null,
    @SerializedName("44.1")
    val fortyFourPointOne: List<Float>? = null,
    @SerializedName("44.2")
    val fortyFourPointTwo: List<Float>? = null,
    @SerializedName("44.3")
    val fortyFourPointThree: List<Float>? = null,
    @SerializedName("44.4")
    val fortyFourPointFour: List<Float>? = null,
    @SerializedName("44.5")
    val fortyFourPointFive: List<Float>? = null,
    @SerializedName("45")
    val fortyFive: List<Float>? = null,
    @SerializedName("45.1")
    val fortyFivePointOne: List<Float>? = null,
    @SerializedName("45.2")
    val fortyFivePointTwo: List<Float>? = null,
    @SerializedName("45.3")
    val fortyFivePointThree: List<Float>? = null,
    @SerializedName("45.4")
    val fortyFivePointFour: List<Float>? = null,
    @SerializedName("45.5")
    val fortyFivePointFive: List<Float>? = null,
    @SerializedName("46")
    val fortySix: List<Float>? = null,
    @SerializedName("46.1")
    val fortySixPointOne: List<Float>? = null,
    @SerializedName("46.2")
    val fortySixPointTwo: List<Float>? = null,
    @SerializedName("46.3")
    val fortySixPointThree: List<Float>? = null,
    @SerializedName("46.4")
    val fortySixPointFour: List<Float>? = null,
    @SerializedName("46.5")
    val fortySixPointFive: List<Float>? = null,
    @SerializedName("47")
    val fortySeven: List<Float>? = null,
    @SerializedName("47.1")
    val fortySevenPointOne: List<Float>? = null,
    @SerializedName("47.2")
    val fortySevenPointTwo: List<Float>? = null,
    @SerializedName("47.3")
    val fortySevenPointThree: List<Float>? = null,
    @SerializedName("47.4")
    val fortySevenPointFour: List<Float>? = null,
    @SerializedName("47.5")
    val fortySevenPointFive: List<Float>? = null,
    @SerializedName("48")
    val fortyEight: List<Float>? = null,
    @SerializedName("48.1")
    val fortyEightPointOne: List<Float>? = null,
    @SerializedName("48.2")
    val fortyEightPointTwo: List<Float>? = null,
    @SerializedName("48.3")
    val fortyEightPointThree: List<Float>? = null,
    @SerializedName("48.4")
    val fortyEightPointFour: List<Float>? = null,
    @SerializedName("48.5")
    val fortyEightPointFive: List<Float>? = null,
    @SerializedName("49")
    val fortyNine: List<Float>? = null,
    @SerializedName("49.1")
    val fortyNinePointOne: List<Float>? = null,
    @SerializedName("49.2")
    val fortyNinePointTwo: List<Float>? = null,
    @SerializedName("49.3")
    val fortyNinePointThree: List<Float>? = null,
    @SerializedName("49.4")
    val fortyNinePointFour: List<Float>? = null,
    @SerializedName("49.5")
    val fortyNinePointFive: List<Float>? = null,
    @SerializedName("50")
    val fifty: List<Float>? = null
)
