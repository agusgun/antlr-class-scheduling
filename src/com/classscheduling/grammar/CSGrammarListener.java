// Generated from /home/agus/Project/ClassScheduling/src/main/antlr4/CSGrammar.g4 by ANTLR 4.7
package com.classscheduling.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSGrammarParser}.
 */
public interface CSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(CSGrammarParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(CSGrammarParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#facilities}.
	 * @param ctx the parse tree
	 */
	void enterFacilities(CSGrammarParser.FacilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#facilities}.
	 * @param ctx the parse tree
	 */
	void exitFacilities(CSGrammarParser.FacilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#capacity_config}.
	 * @param ctx the parse tree
	 */
	void enterCapacity_config(CSGrammarParser.Capacity_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#capacity_config}.
	 * @param ctx the parse tree
	 */
	void exitCapacity_config(CSGrammarParser.Capacity_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#facilities_config}.
	 * @param ctx the parse tree
	 */
	void enterFacilities_config(CSGrammarParser.Facilities_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#facilities_config}.
	 * @param ctx the parse tree
	 */
	void exitFacilities_config(CSGrammarParser.Facilities_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#class_config}.
	 * @param ctx the parse tree
	 */
	void enterClass_config(CSGrammarParser.Class_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#class_config}.
	 * @param ctx the parse tree
	 */
	void exitClass_config(CSGrammarParser.Class_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#classroom}.
	 * @param ctx the parse tree
	 */
	void enterClassroom(CSGrammarParser.ClassroomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#classroom}.
	 * @param ctx the parse tree
	 */
	void exitClassroom(CSGrammarParser.ClassroomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#define_class_config}.
	 * @param ctx the parse tree
	 */
	void enterDefine_class_config(CSGrammarParser.Define_class_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#define_class_config}.
	 * @param ctx the parse tree
	 */
	void exitDefine_class_config(CSGrammarParser.Define_class_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(CSGrammarParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(CSGrammarParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#group_config}.
	 * @param ctx the parse tree
	 */
	void enterGroup_config(CSGrammarParser.Group_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#group_config}.
	 * @param ctx the parse tree
	 */
	void exitGroup_config(CSGrammarParser.Group_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#lecture_requirement}.
	 * @param ctx the parse tree
	 */
	void enterLecture_requirement(CSGrammarParser.Lecture_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#lecture_requirement}.
	 * @param ctx the parse tree
	 */
	void exitLecture_requirement(CSGrammarParser.Lecture_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#lecture}.
	 * @param ctx the parse tree
	 */
	void enterLecture(CSGrammarParser.LectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#lecture}.
	 * @param ctx the parse tree
	 */
	void exitLecture(CSGrammarParser.LectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#define_lecture_requirement}.
	 * @param ctx the parse tree
	 */
	void enterDefine_lecture_requirement(CSGrammarParser.Define_lecture_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#define_lecture_requirement}.
	 * @param ctx the parse tree
	 */
	void exitDefine_lecture_requirement(CSGrammarParser.Define_lecture_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(CSGrammarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(CSGrammarParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(CSGrammarParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(CSGrammarParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#availability_day}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_day(CSGrammarParser.Availability_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#availability_day}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_day(CSGrammarParser.Availability_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#availability_day_time}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_day_time(CSGrammarParser.Availability_day_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#availability_day_time}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_day_time(CSGrammarParser.Availability_day_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#lecturer_details}.
	 * @param ctx the parse tree
	 */
	void enterLecturer_details(CSGrammarParser.Lecturer_detailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#lecturer_details}.
	 * @param ctx the parse tree
	 */
	void exitLecturer_details(CSGrammarParser.Lecturer_detailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void enterLecturer(CSGrammarParser.LecturerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void exitLecturer(CSGrammarParser.LecturerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#define_lecturer}.
	 * @param ctx the parse tree
	 */
	void enterDefine_lecturer(CSGrammarParser.Define_lecturerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#define_lecturer}.
	 * @param ctx the parse tree
	 */
	void exitDefine_lecturer(CSGrammarParser.Define_lecturerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#prefer_cooccurrence}.
	 * @param ctx the parse tree
	 */
	void enterPrefer_cooccurrence(CSGrammarParser.Prefer_cooccurrenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#prefer_cooccurrence}.
	 * @param ctx the parse tree
	 */
	void exitPrefer_cooccurrence(CSGrammarParser.Prefer_cooccurrenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#constraint_separation}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_separation(CSGrammarParser.Constraint_separationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#constraint_separation}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_separation(CSGrammarParser.Constraint_separationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(CSGrammarParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(CSGrammarParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(CSGrammarParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(CSGrammarParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CSGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CSGrammarParser.MainContext ctx);
}