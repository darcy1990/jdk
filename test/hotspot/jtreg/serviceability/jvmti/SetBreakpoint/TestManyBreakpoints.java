/*
 * Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 8144992
 * @requires vm.jvmti
 * @run main/othervm/native -agentlib:TestManyBreakpoints
 *                          -Xlog:gc+metaspace
 *                          -Xint
 *                          -XX:MetaspaceSize=16K -XX:MaxMetaspaceSize=64M
 *                          serviceability.jvmti.SetBreakpoint.TestManyBreakpoints
 */

package serviceability.jvmti.SetBreakpoint;

import java.net.URL;
import java.net.URLClassLoader;

public class TestManyBreakpoints {

  public static void main(String[] args) throws Exception {
    URL url = TestManyBreakpoints.class.getProtectionDomain().getCodeSource().getLocation();
    for (int c = 0; c < 50; c++) {
      System.out.println("Batch " + c);
      URLClassLoader loader = new URLClassLoader(new URL[] {url}, null);
      Class.forName(Target.class.getName(), true, loader);
    }
  }

  static class Target {
    void m1() {}
    void m2() {}
    void m3() {}
    void m4() {}
    void m5() {}
    void m6() {}
    void m7() {}
    void m8() {}
    void m9() {}
    void m10() {}
    void m11() {}
    void m12() {}
    void m13() {}
    void m14() {}
    void m15() {}
    void m16() {}
    void m17() {}
    void m18() {}
    void m19() {}
    void m20() {}
    void m21() {}
    void m22() {}
    void m23() {}
    void m24() {}
    void m25() {}
    void m26() {}
    void m27() {}
    void m28() {}
    void m29() {}
    void m30() {}
    void m31() {}
    void m32() {}
    void m33() {}
    void m34() {}
    void m35() {}
    void m36() {}
    void m37() {}
    void m38() {}
    void m39() {}
    void m40() {}
    void m41() {}
    void m42() {}
    void m43() {}
    void m44() {}
    void m45() {}
    void m46() {}
    void m47() {}
    void m48() {}
    void m49() {}
    void m50() {}
    void m51() {}
    void m52() {}
    void m53() {}
    void m54() {}
    void m55() {}
    void m56() {}
    void m57() {}
    void m58() {}
    void m59() {}
    void m60() {}
    void m61() {}
    void m62() {}
    void m63() {}
    void m64() {}
    void m65() {}
    void m66() {}
    void m67() {}
    void m68() {}
    void m69() {}
    void m70() {}
    void m71() {}
    void m72() {}
    void m73() {}
    void m74() {}
    void m75() {}
    void m76() {}
    void m77() {}
    void m78() {}
    void m79() {}
    void m80() {}
    void m81() {}
    void m82() {}
    void m83() {}
    void m84() {}
    void m85() {}
    void m86() {}
    void m87() {}
    void m88() {}
    void m89() {}
    void m90() {}
    void m91() {}
    void m92() {}
    void m93() {}
    void m94() {}
    void m95() {}
    void m96() {}
    void m97() {}
    void m98() {}
    void m99() {}
    void m100() {}
    void m101() {}
    void m102() {}
    void m103() {}
    void m104() {}
    void m105() {}
    void m106() {}
    void m107() {}
    void m108() {}
    void m109() {}
    void m110() {}
    void m111() {}
    void m112() {}
    void m113() {}
    void m114() {}
    void m115() {}
    void m116() {}
    void m117() {}
    void m118() {}
    void m119() {}
    void m120() {}
    void m121() {}
    void m122() {}
    void m123() {}
    void m124() {}
    void m125() {}
    void m126() {}
    void m127() {}
    void m128() {}
    void m129() {}
    void m130() {}
    void m131() {}
    void m132() {}
    void m133() {}
    void m134() {}
    void m135() {}
    void m136() {}
    void m137() {}
    void m138() {}
    void m139() {}
    void m140() {}
    void m141() {}
    void m142() {}
    void m143() {}
    void m144() {}
    void m145() {}
    void m146() {}
    void m147() {}
    void m148() {}
    void m149() {}
    void m150() {}
    void m151() {}
    void m152() {}
    void m153() {}
    void m154() {}
    void m155() {}
    void m156() {}
    void m157() {}
    void m158() {}
    void m159() {}
    void m160() {}
    void m161() {}
    void m162() {}
    void m163() {}
    void m164() {}
    void m165() {}
    void m166() {}
    void m167() {}
    void m168() {}
    void m169() {}
    void m170() {}
    void m171() {}
    void m172() {}
    void m173() {}
    void m174() {}
    void m175() {}
    void m176() {}
    void m177() {}
    void m178() {}
    void m179() {}
    void m180() {}
    void m181() {}
    void m182() {}
    void m183() {}
    void m184() {}
    void m185() {}
    void m186() {}
    void m187() {}
    void m188() {}
    void m189() {}
    void m190() {}
    void m191() {}
    void m192() {}
    void m193() {}
    void m194() {}
    void m195() {}
    void m196() {}
    void m197() {}
    void m198() {}
    void m199() {}
    void m200() {}
    void m201() {}
    void m202() {}
    void m203() {}
    void m204() {}
    void m205() {}
    void m206() {}
    void m207() {}
    void m208() {}
    void m209() {}
    void m210() {}
    void m211() {}
    void m212() {}
    void m213() {}
    void m214() {}
    void m215() {}
    void m216() {}
    void m217() {}
    void m218() {}
    void m219() {}
    void m220() {}
    void m221() {}
    void m222() {}
    void m223() {}
    void m224() {}
    void m225() {}
    void m226() {}
    void m227() {}
    void m228() {}
    void m229() {}
    void m230() {}
    void m231() {}
    void m232() {}
    void m233() {}
    void m234() {}
    void m235() {}
    void m236() {}
    void m237() {}
    void m238() {}
    void m239() {}
    void m240() {}
    void m241() {}
    void m242() {}
    void m243() {}
    void m244() {}
    void m245() {}
    void m246() {}
    void m247() {}
    void m248() {}
    void m249() {}
    void m250() {}
    void m251() {}
    void m252() {}
    void m253() {}
    void m254() {}
    void m255() {}
    void m256() {}
    void m257() {}
    void m258() {}
    void m259() {}
    void m260() {}
    void m261() {}
    void m262() {}
    void m263() {}
    void m264() {}
    void m265() {}
    void m266() {}
    void m267() {}
    void m268() {}
    void m269() {}
    void m270() {}
    void m271() {}
    void m272() {}
    void m273() {}
    void m274() {}
    void m275() {}
    void m276() {}
    void m277() {}
    void m278() {}
    void m279() {}
    void m280() {}
    void m281() {}
    void m282() {}
    void m283() {}
    void m284() {}
    void m285() {}
    void m286() {}
    void m287() {}
    void m288() {}
    void m289() {}
    void m290() {}
    void m291() {}
    void m292() {}
    void m293() {}
    void m294() {}
    void m295() {}
    void m296() {}
    void m297() {}
    void m298() {}
    void m299() {}
    void m300() {}
    void m301() {}
    void m302() {}
    void m303() {}
    void m304() {}
    void m305() {}
    void m306() {}
    void m307() {}
    void m308() {}
    void m309() {}
    void m310() {}
    void m311() {}
    void m312() {}
    void m313() {}
    void m314() {}
    void m315() {}
    void m316() {}
    void m317() {}
    void m318() {}
    void m319() {}
    void m320() {}
    void m321() {}
    void m322() {}
    void m323() {}
    void m324() {}
    void m325() {}
    void m326() {}
    void m327() {}
    void m328() {}
    void m329() {}
    void m330() {}
    void m331() {}
    void m332() {}
    void m333() {}
    void m334() {}
    void m335() {}
    void m336() {}
    void m337() {}
    void m338() {}
    void m339() {}
    void m340() {}
    void m341() {}
    void m342() {}
    void m343() {}
    void m344() {}
    void m345() {}
    void m346() {}
    void m347() {}
    void m348() {}
    void m349() {}
    void m350() {}
    void m351() {}
    void m352() {}
    void m353() {}
    void m354() {}
    void m355() {}
    void m356() {}
    void m357() {}
    void m358() {}
    void m359() {}
    void m360() {}
    void m361() {}
    void m362() {}
    void m363() {}
    void m364() {}
    void m365() {}
    void m366() {}
    void m367() {}
    void m368() {}
    void m369() {}
    void m370() {}
    void m371() {}
    void m372() {}
    void m373() {}
    void m374() {}
    void m375() {}
    void m376() {}
    void m377() {}
    void m378() {}
    void m379() {}
    void m380() {}
    void m381() {}
    void m382() {}
    void m383() {}
    void m384() {}
    void m385() {}
    void m386() {}
    void m387() {}
    void m388() {}
    void m389() {}
    void m390() {}
    void m391() {}
    void m392() {}
    void m393() {}
    void m394() {}
    void m395() {}
    void m396() {}
    void m397() {}
    void m398() {}
    void m399() {}
    void m400() {}
    void m401() {}
    void m402() {}
    void m403() {}
    void m404() {}
    void m405() {}
    void m406() {}
    void m407() {}
    void m408() {}
    void m409() {}
    void m410() {}
    void m411() {}
    void m412() {}
    void m413() {}
    void m414() {}
    void m415() {}
    void m416() {}
    void m417() {}
    void m418() {}
    void m419() {}
    void m420() {}
    void m421() {}
    void m422() {}
    void m423() {}
    void m424() {}
    void m425() {}
    void m426() {}
    void m427() {}
    void m428() {}
    void m429() {}
    void m430() {}
    void m431() {}
    void m432() {}
    void m433() {}
    void m434() {}
    void m435() {}
    void m436() {}
    void m437() {}
    void m438() {}
    void m439() {}
    void m440() {}
    void m441() {}
    void m442() {}
    void m443() {}
    void m444() {}
    void m445() {}
    void m446() {}
    void m447() {}
    void m448() {}
    void m449() {}
    void m450() {}
    void m451() {}
    void m452() {}
    void m453() {}
    void m454() {}
    void m455() {}
    void m456() {}
    void m457() {}
    void m458() {}
    void m459() {}
    void m460() {}
    void m461() {}
    void m462() {}
    void m463() {}
    void m464() {}
    void m465() {}
    void m466() {}
    void m467() {}
    void m468() {}
    void m469() {}
    void m470() {}
    void m471() {}
    void m472() {}
    void m473() {}
    void m474() {}
    void m475() {}
    void m476() {}
    void m477() {}
    void m478() {}
    void m479() {}
    void m480() {}
    void m481() {}
    void m482() {}
    void m483() {}
    void m484() {}
    void m485() {}
    void m486() {}
    void m487() {}
    void m488() {}
    void m489() {}
    void m490() {}
    void m491() {}
    void m492() {}
    void m493() {}
    void m494() {}
    void m495() {}
    void m496() {}
    void m497() {}
    void m498() {}
    void m499() {}
    void m500() {}
    void m501() {}
    void m502() {}
    void m503() {}
    void m504() {}
    void m505() {}
    void m506() {}
    void m507() {}
    void m508() {}
    void m509() {}
    void m510() {}
    void m511() {}
    void m512() {}
    void m513() {}
    void m514() {}
    void m515() {}
    void m516() {}
    void m517() {}
    void m518() {}
    void m519() {}
    void m520() {}
    void m521() {}
    void m522() {}
    void m523() {}
    void m524() {}
    void m525() {}
    void m526() {}
    void m527() {}
    void m528() {}
    void m529() {}
    void m530() {}
    void m531() {}
    void m532() {}
    void m533() {}
    void m534() {}
    void m535() {}
    void m536() {}
    void m537() {}
    void m538() {}
    void m539() {}
    void m540() {}
    void m541() {}
    void m542() {}
    void m543() {}
    void m544() {}
    void m545() {}
    void m546() {}
    void m547() {}
    void m548() {}
    void m549() {}
    void m550() {}
    void m551() {}
    void m552() {}
    void m553() {}
    void m554() {}
    void m555() {}
    void m556() {}
    void m557() {}
    void m558() {}
    void m559() {}
    void m560() {}
    void m561() {}
    void m562() {}
    void m563() {}
    void m564() {}
    void m565() {}
    void m566() {}
    void m567() {}
    void m568() {}
    void m569() {}
    void m570() {}
    void m571() {}
    void m572() {}
    void m573() {}
    void m574() {}
    void m575() {}
    void m576() {}
    void m577() {}
    void m578() {}
    void m579() {}
    void m580() {}
    void m581() {}
    void m582() {}
    void m583() {}
    void m584() {}
    void m585() {}
    void m586() {}
    void m587() {}
    void m588() {}
    void m589() {}
    void m590() {}
    void m591() {}
    void m592() {}
    void m593() {}
    void m594() {}
    void m595() {}
    void m596() {}
    void m597() {}
    void m598() {}
    void m599() {}
    void m600() {}
    void m601() {}
    void m602() {}
    void m603() {}
    void m604() {}
    void m605() {}
    void m606() {}
    void m607() {}
    void m608() {}
    void m609() {}
    void m610() {}
    void m611() {}
    void m612() {}
    void m613() {}
    void m614() {}
    void m615() {}
    void m616() {}
    void m617() {}
    void m618() {}
    void m619() {}
    void m620() {}
    void m621() {}
    void m622() {}
    void m623() {}
    void m624() {}
    void m625() {}
    void m626() {}
    void m627() {}
    void m628() {}
    void m629() {}
    void m630() {}
    void m631() {}
    void m632() {}
    void m633() {}
    void m634() {}
    void m635() {}
    void m636() {}
    void m637() {}
    void m638() {}
    void m639() {}
    void m640() {}
    void m641() {}
    void m642() {}
    void m643() {}
    void m644() {}
    void m645() {}
    void m646() {}
    void m647() {}
    void m648() {}
    void m649() {}
    void m650() {}
    void m651() {}
    void m652() {}
    void m653() {}
    void m654() {}
    void m655() {}
    void m656() {}
    void m657() {}
    void m658() {}
    void m659() {}
    void m660() {}
    void m661() {}
    void m662() {}
    void m663() {}
    void m664() {}
    void m665() {}
    void m666() {}
    void m667() {}
    void m668() {}
    void m669() {}
    void m670() {}
    void m671() {}
    void m672() {}
    void m673() {}
    void m674() {}
    void m675() {}
    void m676() {}
    void m677() {}
    void m678() {}
    void m679() {}
    void m680() {}
    void m681() {}
    void m682() {}
    void m683() {}
    void m684() {}
    void m685() {}
    void m686() {}
    void m687() {}
    void m688() {}
    void m689() {}
    void m690() {}
    void m691() {}
    void m692() {}
    void m693() {}
    void m694() {}
    void m695() {}
    void m696() {}
    void m697() {}
    void m698() {}
    void m699() {}
    void m700() {}
    void m701() {}
    void m702() {}
    void m703() {}
    void m704() {}
    void m705() {}
    void m706() {}
    void m707() {}
    void m708() {}
    void m709() {}
    void m710() {}
    void m711() {}
    void m712() {}
    void m713() {}
    void m714() {}
    void m715() {}
    void m716() {}
    void m717() {}
    void m718() {}
    void m719() {}
    void m720() {}
    void m721() {}
    void m722() {}
    void m723() {}
    void m724() {}
    void m725() {}
    void m726() {}
    void m727() {}
    void m728() {}
    void m729() {}
    void m730() {}
    void m731() {}
    void m732() {}
    void m733() {}
    void m734() {}
    void m735() {}
    void m736() {}
    void m737() {}
    void m738() {}
    void m739() {}
    void m740() {}
    void m741() {}
    void m742() {}
    void m743() {}
    void m744() {}
    void m745() {}
    void m746() {}
    void m747() {}
    void m748() {}
    void m749() {}
    void m750() {}
    void m751() {}
    void m752() {}
    void m753() {}
    void m754() {}
    void m755() {}
    void m756() {}
    void m757() {}
    void m758() {}
    void m759() {}
    void m760() {}
    void m761() {}
    void m762() {}
    void m763() {}
    void m764() {}
    void m765() {}
    void m766() {}
    void m767() {}
    void m768() {}
    void m769() {}
    void m770() {}
    void m771() {}
    void m772() {}
    void m773() {}
    void m774() {}
    void m775() {}
    void m776() {}
    void m777() {}
    void m778() {}
    void m779() {}
    void m780() {}
    void m781() {}
    void m782() {}
    void m783() {}
    void m784() {}
    void m785() {}
    void m786() {}
    void m787() {}
    void m788() {}
    void m789() {}
    void m790() {}
    void m791() {}
    void m792() {}
    void m793() {}
    void m794() {}
    void m795() {}
    void m796() {}
    void m797() {}
    void m798() {}
    void m799() {}
    void m800() {}
    void m801() {}
    void m802() {}
    void m803() {}
    void m804() {}
    void m805() {}
    void m806() {}
    void m807() {}
    void m808() {}
    void m809() {}
    void m810() {}
    void m811() {}
    void m812() {}
    void m813() {}
    void m814() {}
    void m815() {}
    void m816() {}
    void m817() {}
    void m818() {}
    void m819() {}
    void m820() {}
    void m821() {}
    void m822() {}
    void m823() {}
    void m824() {}
    void m825() {}
    void m826() {}
    void m827() {}
    void m828() {}
    void m829() {}
    void m830() {}
    void m831() {}
    void m832() {}
    void m833() {}
    void m834() {}
    void m835() {}
    void m836() {}
    void m837() {}
    void m838() {}
    void m839() {}
    void m840() {}
    void m841() {}
    void m842() {}
    void m843() {}
    void m844() {}
    void m845() {}
    void m846() {}
    void m847() {}
    void m848() {}
    void m849() {}
    void m850() {}
    void m851() {}
    void m852() {}
    void m853() {}
    void m854() {}
    void m855() {}
    void m856() {}
    void m857() {}
    void m858() {}
    void m859() {}
    void m860() {}
    void m861() {}
    void m862() {}
    void m863() {}
    void m864() {}
    void m865() {}
    void m866() {}
    void m867() {}
    void m868() {}
    void m869() {}
    void m870() {}
    void m871() {}
    void m872() {}
    void m873() {}
    void m874() {}
    void m875() {}
    void m876() {}
    void m877() {}
    void m878() {}
    void m879() {}
    void m880() {}
    void m881() {}
    void m882() {}
    void m883() {}
    void m884() {}
    void m885() {}
    void m886() {}
    void m887() {}
    void m888() {}
    void m889() {}
    void m890() {}
    void m891() {}
    void m892() {}
    void m893() {}
    void m894() {}
    void m895() {}
    void m896() {}
    void m897() {}
    void m898() {}
    void m899() {}
    void m900() {}
    void m901() {}
    void m902() {}
    void m903() {}
    void m904() {}
    void m905() {}
    void m906() {}
    void m907() {}
    void m908() {}
    void m909() {}
    void m910() {}
    void m911() {}
    void m912() {}
    void m913() {}
    void m914() {}
    void m915() {}
    void m916() {}
    void m917() {}
    void m918() {}
    void m919() {}
    void m920() {}
    void m921() {}
    void m922() {}
    void m923() {}
    void m924() {}
    void m925() {}
    void m926() {}
    void m927() {}
    void m928() {}
    void m929() {}
    void m930() {}
    void m931() {}
    void m932() {}
    void m933() {}
    void m934() {}
    void m935() {}
    void m936() {}
    void m937() {}
    void m938() {}
    void m939() {}
    void m940() {}
    void m941() {}
    void m942() {}
    void m943() {}
    void m944() {}
    void m945() {}
    void m946() {}
    void m947() {}
    void m948() {}
    void m949() {}
    void m950() {}
    void m951() {}
    void m952() {}
    void m953() {}
    void m954() {}
    void m955() {}
    void m956() {}
    void m957() {}
    void m958() {}
    void m959() {}
    void m960() {}
    void m961() {}
    void m962() {}
    void m963() {}
    void m964() {}
    void m965() {}
    void m966() {}
    void m967() {}
    void m968() {}
    void m969() {}
    void m970() {}
    void m971() {}
    void m972() {}
    void m973() {}
    void m974() {}
    void m975() {}
    void m976() {}
    void m977() {}
    void m978() {}
    void m979() {}
    void m980() {}
    void m981() {}
    void m982() {}
    void m983() {}
    void m984() {}
    void m985() {}
    void m986() {}
    void m987() {}
    void m988() {}
    void m989() {}
    void m990() {}
    void m991() {}
    void m992() {}
    void m993() {}
    void m994() {}
    void m995() {}
    void m996() {}
    void m997() {}
    void m998() {}
    void m999() {}
    void m1000() {}
  }

}
