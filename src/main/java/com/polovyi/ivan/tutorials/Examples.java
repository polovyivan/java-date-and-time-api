package com.polovyi.ivan.tutorials;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {

        System.out.println("Now method.");
        LocalTime example1 = LocalTime.now();
        // 21:42:52.726155657
        System.out.println("example1 = " + example1);

        LocalDate example2 = LocalDate.now();
        // 2024-09-02
        System.out.println("example2 = " + example2);

        LocalDateTime example3 = LocalDateTime.now();
        // 2024-09-02T21:42:52.727032807
        System.out.println("example3 = " + example3);

        ZonedDateTime example4 = ZonedDateTime.now();
        // 2024-09-02T21:42:52.727430121-03:00[America/Araguaina]
        System.out.println("example4 = " + example4);

        Instant example5 = Instant.now();
        // 2024-09-03T00:42:52.727550906Z
        System.out.println("example5 = " + example5);

        System.out.println("Of method.");

        LocalTime example6 = LocalTime.of(1, 10);
        // 01:10:35
        System.out.println("example6 = " + example6);

        LocalTime example7 = LocalTime.of(1, 10, 35);
        // 01:10:35
        System.out.println("example7 = " + example7);

        LocalTime example8 = LocalTime.of(1, 10, 35, 100);
        // 01:10:35.000000100
        System.out.println("example8 = " + example8);

        LocalTime example9 = LocalTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        // 22:12:56.156395350
        System.out.println("example9 = " + example9);

        LocalTime example10 = LocalTime.ofNanoOfDay(10 * 60 * 60 * 1000000000L - 1);
        // 09:59:59.999999999
        System.out.println("example10 = " + example10);

        LocalTime example11 = LocalTime.ofSecondOfDay(9 * 60 * 60);
        // 09:00
        System.out.println("example11 = " + example11);

        LocalTime example12 = LocalTime.MIN;
        // 00:00
        System.out.println("example12 = " + example12);

        LocalTime example13 = LocalTime.NOON;
        // 12:00
        System.out.println("example13 = " + example13);

        LocalTime example14 = LocalTime.MIDNIGHT;
        // 00:00
        System.out.println("example14 = " + example14);

        LocalTime example15 = LocalTime.MAX;
        // 23:59:59.999999999
        System.out.println("example15 = " + example15);

        // ====================================================================
        LocalDate example16 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example16 = " + example16);
        LocalDate example17 = LocalDate.of(2024, Month.SEPTEMBER, 2);
        // 2024-09-02
        System.out.println("example17 = " + example17);
        LocalDate example18 = LocalDate.ofYearDay(2024, 246);
        // 2024-09-02
        System.out.println("example18 = " + example18);
        LocalDate example19 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        // 2024-09-02
        System.out.println("example19 = " + example19);

        LocalDate example20 = LocalDate.ofEpochDay(19969L);
        // 2024-09-03
        System.out.println("example20 = " + example20);

        LocalDate example21 = LocalDate.MIN;
        // -999999999-01-01
        System.out.println("example21 = " + example21);

        LocalDate example22 = LocalDate.MAX;
        // +999999999-12-31
        System.out.println("example22 = " + example22);

        LocalDate example23 = LocalDate.EPOCH;
        // 1970-01-01
        System.out.println("example23 = " + example23);

        // =================================================

        LocalDateTime example24 = LocalDateTime
                .of(2024, 9, 2, 1, 30);
        // 2024-09-02T01:30
        System.out.println("example24 = " + example24);

        LocalDateTime example25 = LocalDateTime
                .of(2024, Month.SEPTEMBER, 2, 1, 30);
        // 2024-09-02T01:30
        System.out.println("example25 = " + example25);

        LocalDateTime example26 = LocalDateTime
                .of(2024, 9, 2, 1, 30, 59);
        // 2024-09-02T01:30:59
        System.out.println("example26 = " + example26);

        LocalDateTime example27 = LocalDateTime
                .of(2024, Month.SEPTEMBER, 2, 1, 30, 59);
        // 2024-09-02T01:30:59
        System.out.println("example27 = " + example27);

        LocalDateTime example28 = LocalDateTime
                .of(2024, 9, 2, 1, 30, 59, 100);
        // 2024-09-02T01:30:59.000000100
        System.out.println("example28 = " + example28);

        LocalDateTime example29 = LocalDateTime
                .of(2024, Month.SEPTEMBER, 2, 1, 30, 59, 100);
        // 2024-09-02T01:30:59.000000100
        System.out.println("example29 = " + example29);

        LocalDateTime example30 = LocalDateTime
                .of(LocalDate.of(2024, 9, 2), LocalTime.of(1, 30));
        // 2024-09-02T01:30
        System.out.println("example30 = " + example30);
// ====================================================================================================

        Instant example31 = Instant.ofEpochMilli(1725494870000L);
        // 2024-09-04T00:02:50Z
        System.out.println("example31 = " + example31);

        Instant example32 = Instant.ofEpochSecond(1725494870L);
        // 2024-09-05T00:07:50Z
        System.out.println("example32 = " + example32);

        Instant example33 = Instant.ofEpochSecond(1725494870L, 100L);
        // 2024-09-05T00:07:50Z
        System.out.println("example33 = " + example33);

        Instant example34 = Instant.EPOCH;
        // 1970-01-01T00:00:00Z
        System.out.println("example34 = " + example34);

        Instant example35 = Instant.MIN;
        // -1000000000-01-01T00:00:00Z
        System.out.println("example35 = " + example35);

        Instant example36 = Instant.MAX;
        // +1000000000-12-31T23:59:59.999999999Z
        System.out.println("example36 = " + example36);

        // ===========================================================
//
        TemporalField example37 = ChronoField.MINUTE_OF_HOUR;
        // MinuteOfHour
        System.out.println("example37 = " + example37);
        TemporalUnit example38 = ChronoField.MINUTE_OF_HOUR.getBaseUnit();
        // Minutes
        System.out.println("example38 = " + example38);
        long example39 = ChronoField.MINUTE_OF_HOUR.checkValidValue(59);
        // 59
        System.out.println("example39 = " + example39);

        // long example40 = ChronoField.MINUTE_OF_HOUR.checkValidValue(60);
        // throws DateTimeException: Invalid value for MinuteOfHour (valid values 0 - 59): 60
        // System.out.println("example40 = " + example40);

        TemporalUnit example41 = ChronoField.MINUTE_OF_HOUR.getRangeUnit();
        // Hours
        System.out.println("example41 = " + example41);

        ValueRange example42 = ChronoField.MINUTE_OF_HOUR.range();
        // 0 - 59
        System.out.println("example42 = " + example42);

        boolean example43 = ChronoField.MINUTE_OF_HOUR.isDateBased();
        // false
        System.out.println("example43 = " + example43);

        boolean example44 = ChronoField.MINUTE_OF_HOUR.isTimeBased();
        // true
        System.out.println("example44 = " + example44);

        boolean example45 = ChronoField.MINUTE_OF_HOUR.isSupportedBy(LocalDateTime.now());
        // true
        System.out.println("example45 = " + example45);

        boolean example46 = ChronoField.MINUTE_OF_HOUR.isSupportedBy(LocalDate.now());
        // false
        System.out.println("example46 = " + example46);

        // ==================================================
        int example47 = LocalDateTime
                .of(2024, 9, 2, 1, 30, 59, 100).getHour();
        // 1
        System.out.println("example47 = " + example47);

        int example48 = LocalDate
                .of(2024, 9, 2).getYear();
        System.out.println("example48 = " + example48);
        // 2024
        int example49 = LocalDate
                .of(2024, 9, 2).get(ChronoField.ERA);
        // 1
        System.out.println("example49 = " + example49);

        boolean example50 = LocalDate
                .of(2024, 9, 2).isSupported(ChronoField.ERA);
        // true
        System.out.println("example50 = " + example50);

        boolean example51 = LocalDate
                .of(2024, 9, 2).isSupported(ChronoField.SECOND_OF_DAY);
        // false
        System.out.println("example51 = " + example51);

        LocalDate example52 = LocalDate
                .of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example52 = " + example52);
        LocalDate example52Adjusted = example52.withYear(2000);
        // 2000-09-02
        System.out.println("example52Adjusted = " + example52Adjusted);

        LocalTime example53 = LocalTime
                .of(3, 9, 2);
        // 03:09:02
        System.out.println("example53 = " + example53);
        LocalTime example53Adjusted = example53.withHour(5);
        // 05:09:02
        System.out.println("example53Adjusted = " + example53Adjusted);

        LocalDate example54 = LocalDate.of(2024, 9, 2);
        //2024-09-02
        System.out.println("example54 = " + example54);
        LocalDate example55PlusOneDay = example54.plusDays(1);
        System.out.println("example55PlusOneDay = " + example55PlusOneDay);
        // 2024-09-03
        LocalDate example55PlusOneDayGenericMethod = example55PlusOneDay.plus(Period.ofDays(1));
        System.out.println("example55PlusOneDayGenericMethod = " + example55PlusOneDayGenericMethod);
        // 2024-09-04
        System.out.println("example55PlusOneDayGenericMethod = " + example55PlusOneDayGenericMethod);
        LocalDate example55PlusOneDayGenericMethod2 = example55PlusOneDayGenericMethod.plus(1, ChronoUnit.DAYS);
        // 2020-09-05
        System.out.println("example55PlusOneDayGenericMethod2 = " + example55PlusOneDayGenericMethod2);
        LocalDate example56 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example55 = " + example56);
        LocalDate example56MinusOneDay = example56.minusDays(1);
        // 2024-09-01
        System.out.println("example56MinusOneDay = " + example56MinusOneDay);
        LocalDate example56MinusOneDayGenericMethod = example56MinusOneDay.minus(Period.ofDays(1));
        // 2024-08-31
        System.out.println("example56MinusOneDayGenericMethod = " + example56MinusOneDayGenericMethod);
        LocalDate example56MinusOneDayGenericMethod2 = example56MinusOneDayGenericMethod.minus(1, ChronoUnit.DAYS);
        // 2024-08-30
        System.out.println("example56MinusOneDayGenericMethod2 = " + example56MinusOneDayGenericMethod2);

        LocalDate example57 = LocalDate.of(2024, 9, 2);

        for (int i = 0; i < 3; i++) {
            example57 = example57.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            System.out.println("example57NextMonday = " + example57);
        }
        // 2024-09-09
        // 2024-09-16
        // 2024-09-23
        LocalDate example58 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example58 = " + example58);
        LocalDate example58LastDayOfMonth = example58.with(TemporalAdjusters.lastDayOfMonth());
        // 2024-09-30
        System.out.println("example58LastDayOfMonth = " + example58LastDayOfMonth);

        LocalDate example59 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example59 = " + example59);
        LocalDate example59NextDay = example58.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        // 2024-09-08
        System.out.println("example59NextDay = " + example59NextDay);

        LocalDate example60 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example60 = " + example60);
        LocalDate example60NextOrTheSame = example60.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        // 2024-09-02
        System.out.println("example60NextOrTheSame = " + example60NextOrTheSame);

        LocalDate example61 = LocalDate.of(2024, 9, 2);
        // 2024-09-02
        System.out.println("example61 = " + example61);
        LocalDate example61NextOrTheSame = example60.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        // 2024-08-26
        System.out.println("example61NextOrTheSame = " + example61NextOrTheSame);

        // ===========================================================

        boolean example62 = LocalDate.of(2024, 9, 2)
                .isBefore(LocalDate.of(2024, 9, 3));
        // true
        System.out.println("example62 = " + example62);

        boolean example63 = LocalDate.of(2024, 9, 2)
                .isBefore(LocalDate.of(2024, 9, 2));
        // false
        System.out.println("example63 = " + example63);

        boolean example64 = LocalDate.of(2024, 9, 2)
                .equals(LocalDate.of(2024, 9, 2));
        // true
        System.out.println("example64 = " + example64);

        boolean example65 = LocalTime.of(10, 9, 2)
                .isBefore(LocalTime.of(10, 9, 3));
        // true
        System.out.println("example65 = " + example65);

        boolean example66 = Instant.MAX.isAfter(Instant.MIN);
        // true
        System.out.println("example66 = " + example66);

        Optional<LocalDate> example67 = Stream.of(LocalDate.of(2024, 9, 2),
                        LocalDate.of(2024, 9, 3),
                        LocalDate.of(2024, 9, 1))
                .max(Comparator.naturalOrder());
        // Optional[2024-09-03]
        System.out.println("example67 = " + example67);

        List<LocalDate> example68 = Stream.of(LocalDate.of(2024, 9, 2),
                        LocalDate.of(2024, 9, 3),
                        LocalDate.of(2024, 9, 1))
                .sorted()
                .toList();
        // [2024-09-01, 2024-09-02, 2024-09-03]
        System.out.println("example68 = " + example68);

        // =================================================================

        Period example69 = Period.ZERO;
        // P0D
        System.out.println("example69 = " + example69);

        Period example70 = Period.ofDays(1);
        // P1D
        System.out.println("example70 = " + example70);

        Period example71 = Period.ofWeeks(1);
        // P7D
        System.out.println("example71 = " + example71);

        Period example72 = Period.ofMonths(1);
        // P1M
        System.out.println("example72 = " + example72);

        Period example73 = Period.ofYears(1);
        // P1Y
        System.out.println("example73 = " + example73);

        Period example74 = Period.ofDays(-1);
        // P-1D
        System.out.println("example74 = " + example74);

        Period example75 = Period.of(2024, 9, 2);
        // P2024Y9M2D
        System.out.println("example75 = " + example75);

        Period example76 = Period.between(LocalDate.of(2024, 9, 2),
                LocalDate.of(2024, 9, 3));
        // P1D
        System.out.println("example76 = " + example76);

        Period example77 = Period.from(Period.ofDays(1));
        // P1D
        System.out.println("example77 = " + example77);

        long example78 = Period.of(2024, 9, 2).get(ChronoUnit.YEARS);
        // 2024
        System.out.println("example78 = " + example78);

        Period example79 = Period.of(2024, 9, 2).withDays(3);
        // P2024Y9M3D
        System.out.println("example79 = " + example79);

        Temporal example80 = Period.of(2024, 9, 2)
                .addTo(LocalDate.of(2024, 9, 3));
        // 4049-06-05
        System.out.println("example81 = " + example80);

        Temporal example81 = Period.of(2023, 9, 2)
                .subtractFrom(LocalDate.of(2024, 9, 3));

        // 0000-12-01
        System.out.println("example81 = " + example81);

        boolean example82 = Period.ofDays(-1).isNegative();
        // true
        System.out.println("example82 = " + example82);

        Period example83 = Period.ofDays(1).plus(Period.ofDays(1));
        // P2D
        System.out.println("example83 = " + example83);

        Period example84 = Period.ofDays(2).minus(Period.ofDays(1));
        // P1D
        System.out.println("example84 = " + example84);
        Period example85 = Period.ofDays(1).multipliedBy(5);
        // P5D
        System.out.println("example85 = " + example85);

        Period example86 = Period.ofDays(1).withDays(3);
        // P3D
        System.out.println("example86 = " + example86);

// ===============================================================

        Duration example87 = Duration.ZERO;
        // PT0S
        System.out.println("example87 = " + example87);

        Duration example88 = Duration.ofDays(1);
        // PT24
        System.out.println("example88 = " + example88);

        Duration example89 = Duration.ofHours(1);
        // PT1H
        System.out.println("example89 = " + example89);

        Duration example90 = Duration.ofMinutes(10);
        // PT10M
        System.out.println("example90 = " + example90);

        Duration example91 = Duration.of(1, ChronoUnit.DAYS);
        // PT24H
        System.out.println("example91 = " + example91);

        Duration example92 = Duration.between(LocalTime.of(1, 10, 14),
                LocalTime.of(1, 10, 15));
        // PT1S
        System.out.println("example92 = " + example92);

        Duration example93 = Duration.from(Duration.ZERO);
        // PT0S
        System.out.println("example93 = " + example93);

        Duration example94 = Duration.ofHours(1).withSeconds(10);
        // PT10S
        System.out.println("example94 = " + example94);

        Duration example95 = Duration.ofHours(1).withNanos(1);
        // PT1H0.000000001S
        System.out.println("example95 = " + example95);

        Duration example96 = Duration.ofHours(-1);
        // PT-1H
        System.out.println("example96 = " + example96);

        boolean example97 = Duration.ofHours(-1).isNegative();
        // true
        System.out.println("example97 = " + example97);

        boolean example98 = Duration.ofHours(-1).isPositive();
        // false
        System.out.println("example98 = " + example98);

        boolean example99 = Duration.ofHours(-1).isZero();
        // false
        System.out.println("example99 = " + example99);

        Temporal example100 = Duration.ofHours(1)
                .addTo(LocalTime.of(1, 10, 14));
        // 02:10:14
        System.out.println("example100 = " + example100);

        Temporal example101 = Duration.ofHours(1)
                .subtractFrom(LocalTime.of(1, 10, 14));
        // 00:10:14
        System.out.println("example101 = " + example101);

        Duration example102 = Duration.ofHours(1).multipliedBy(5);
        // PT5H
        System.out.println("example102 = " + example102);

        Duration example103 = Duration.ofHours(1).dividedBy(5);
        // PT12M
        System.out.println("example103 = " + example103);

        long example104 = Duration.ofHours(1).dividedBy(Duration.ofMinutes(10));
        // 6
        System.out.println("example104 = " + example104);

        Duration example105 = Duration.ofHours(1).minus(Duration.ofMinutes(10));
        // PT50M
        System.out.println("example105 = " + example105);

        Duration example106 = Duration.ofHours(1).minus(10, ChronoUnit.MINUTES);
        // PT50M
        System.out.println("example106 = " + example106);

        Duration example107 = Duration.ofHours(1).minusMinutes(10);
        // PT50M
        System.out.println("example107 = " + example107);

        Duration example108 = Duration.ofHours(1).plus(Duration.ofMinutes(10));
        // PT1H10M
        System.out.println("example108 = " + example108);

        Duration example109 = Duration.ofHours(1).plus(10, ChronoUnit.MINUTES);
        // PT1H10M
        System.out.println("example109 = " + example109);

        Duration example110 = Duration.ofHours(1).plusMinutes(10);
        // PT1H10M
        System.out.println("example110 = " + example110);

        long example111 = Duration.ofHours(25).toDays();
        // 1
        System.out.println("example111 = " + example111);

        long example112 = Duration.ofHours(25).toMillis();
        // 90000000
        System.out.println("example112 = " + example112);

        List<TemporalUnit> example113 = Duration.ofDays(1).getUnits();
        // [Seconds, Nanos]
        System.out.println("example113 = " + example113);

        Duration example114 = Duration.ofHours(49).truncatedTo(ChronoUnit.DAYS);
        // PT48H
        System.out.println("example114 = " + example114);

//=================================================================
        LocalDate example115 = LocalDate.parse("2024-09-02");
        // 2024-09-02
        System.out.println("example115 = " + example115);

        LocalTime example116 = LocalTime.parse("10:15");
        // 10:15
        System.out.println("example116 = " + example116);

        LocalDateTime example117 = LocalDateTime.parse("2024-09-02T10:15");
        // 2024-09-02T10:15
        System.out.println("example117 = " + example117);

        Instant example118 = Instant.parse("2024-09-04T10:15:00.00Z");
        // 2024-09-04T10:15:00Z
        System.out.println("example118 = " + example118);

        Period example119 = Period.parse("P2Y3M5D");
        // P2Y3M5D
        System.out.println("example119 = " + example119);

        Duration example120 = Duration.parse("PT48H30M");
        // PT48H30M
        System.out.println("example120 = " + example120);

        LocalDate example121 = LocalDate
                .parse("2024-09-04", DateTimeFormatter.ISO_LOCAL_DATE);
        // 2024-09-04
        System.out.println("example121 = " + example121);

        LocalDate example122 = LocalDate
                .parse("20240904", DateTimeFormatter.BASIC_ISO_DATE);
        // 2024-09-04
        System.out.println("example122 = " + example122);

        LocalDate example123 = LocalDate
                .parse("2024-W36-3", DateTimeFormatter.ISO_WEEK_DATE);
        // 2024-09-04
        System.out.println("example123 = " + example123);

        LocalDate example124 = LocalDate.parse("2024/09/04",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        // 2024-09-04
        System.out.println("example124 = " + example124);

// =============================================================================

        LocalDateTime example125 = LocalDate.of(2024, 9, 4)
                .atStartOfDay();
        // 2024-09-04T00:00
        System.out.println("example125 = " + example125);

        LocalDateTime example126 = LocalDate.of(2024, 9, 4)
                .atTime(LocalTime.MAX);
        // 2024-09-04T23:59:59.999999999
        System.out.println("example126 = " + example126);

        LocalDateTime example127 = LocalDate.of(2024, 9, 4)
                .atTime(10, 15);
        // 2024-09-04T10:15
        System.out.println("example127 = " + example127);

        LocalDateTime example128 = LocalDate.of(2024, 9, 4)
                .atTime(10, 15, 5, 100);
        // 2024-09-04T10:15:05.000000100
        System.out.println("example128 = " + example128);

        LocalDateTime example129 = LocalDate.of(2024, 9, 4)
                .atTime(LocalTime.of(10, 15));
        // 2024-09-04T10:15
        System.out.println("example129 = " + example129);

        LocalDate example130 = LocalDateTime.of(2024, 9, 4, 10, 15)
                .toLocalDate();
        // 2024-09-04
        System.out.println("example130 = " + example130);

        LocalTime example131 = LocalDateTime.of(2024, 9, 4, 10, 15)
                .toLocalTime();
        // 2024-09-04
        System.out.println("example131 = " + example131);

        Instant example132 = LocalDateTime.of(2024, 9, 4, 10, 15)
                .toInstant(ZoneOffset.UTC);
        // 2024-09-04T10:15:00Z
        System.out.println("example132 = " + example132);

        LocalDate example133 = LocalDate.ofInstant(Instant.ofEpochSecond(1725494870L),
                ZoneId.of("America/Chicago"));
        // 2024-09-04
        System.out.println("example133 = " + example133);

        LocalTime example134 = LocalTime.ofInstant(Instant.ofEpochSecond(1725494870000L),
                ZoneId.of("America/Chicago"));
        // 05:33:20
        System.out.println("example134 = " + example134);

        LocalDateTime example135 = LocalDateTime.ofInstant(Instant.ofEpochSecond(1725494870L),
                ZoneId.of("America/Chicago"));
        // 2024-09-04T19:07:50
        System.out.println("example135 = " + example135);

        // ==============================================================

        LocalDate example136 = LocalDate.ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 2024-09-04
        System.out.println("example136 = " + example136);

        LocalTime example137 = LocalTime.ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 19:07:50
        System.out.println("example137 = " + example137);

        LocalDateTime example138 = LocalDateTime.ofInstant(Date.from(Instant.ofEpochSecond(1725494870L)).toInstant(),
                ZoneId.of("America/Chicago"));
        // 2024-09-04T19:07:50
        System.out.println("example138 = " + example138);

        Date example139 = Date.from(LocalDateTime.of(2024, 9, 4, 10, 15)
                .toInstant(ZoneOffset.UTC));
        // Wed Sep 04 07:15:00 BRT 2024
        System.out.println("example139 = " + example139);

        Date example140 = Date.from(LocalDate.of(2024, 9, 4).atStartOfDay()
                .toInstant(ZoneOffset.UTC));
        // Tue Sep 03 21:00:00 BRT 2024
        System.out.println("example140 = " + example140);

        Date example141 = Date.from(LocalDateTime.of(LocalDate.of(2024, 9, 4), LocalTime.NOON)
                .toInstant(ZoneOffset.UTC));
        // Wed Sep 04 09:00:00 BRT 2024
        System.out.println("example141 = " + example141);

    }
}