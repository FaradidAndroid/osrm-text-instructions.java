package org.project_osrm.instructions;

public class TextInstructionsFixtures {

  protected static final String[] FIXTURES = new String[] {
    "osrm/v5/arrive/left.json",
    "osrm/v5/arrive/no_modifier.json",
    "osrm/v5/arrive/right.json",
    "osrm/v5/arrive/sharp_left.json",
    "osrm/v5/arrive/sharp_right.json",
    "osrm/v5/arrive/slight_left.json",
    "osrm/v5/arrive/slight_right.json",
    "osrm/v5/arrive/straight.json",
    "osrm/v5/arrive/uturn.json",
    "osrm/v5/continue/left_default.json",
    "osrm/v5/continue/left_destination.json",
    "osrm/v5/continue/left_name.json",
    "osrm/v5/continue/right_default.json",
    "osrm/v5/continue/right_destination.json",
    "osrm/v5/continue/right_name.json",
    "osrm/v5/continue/sharp_left_default.json",
    "osrm/v5/continue/sharp_left_destination.json",
    "osrm/v5/continue/sharp_left_name.json",
    "osrm/v5/continue/sharp_right_default.json",
    "osrm/v5/continue/sharp_right_destination.json",
    "osrm/v5/continue/sharp_right_name.json",
    "osrm/v5/continue/slight_left_default.json",
    "osrm/v5/continue/slight_left_destination.json",
    "osrm/v5/continue/slight_left_name.json",
    "osrm/v5/continue/slight_right_default.json",
    "osrm/v5/continue/slight_right_destination.json",
    "osrm/v5/continue/slight_right_name.json",
    "osrm/v5/continue/straight_default.json",
    "osrm/v5/continue/straight_destination.json",
    "osrm/v5/continue/straight_name.json",
    "osrm/v5/continue/uturn_default.json",
    "osrm/v5/continue/uturn_destination.json",
    "osrm/v5/continue/uturn_name.json",
    "osrm/v5/depart/east_110.json",
    "osrm/v5/depart/east_70.json",
    "osrm/v5/depart/modifier_default.json",
    "osrm/v5/depart/modifier_destination.json",
    "osrm/v5/depart/modifier_name.json",
    "osrm/v5/depart/north_20.json",
    "osrm/v5/depart/north_340.json",
    "osrm/v5/depart/northeast_21.json",
    "osrm/v5/depart/northeast_69.json",
    "osrm/v5/depart/northwest_291.json",
    "osrm/v5/depart/northwest_339.json",
    "osrm/v5/depart/south_160.json",
    "osrm/v5/depart/south_200.json",
    "osrm/v5/depart/southeast_111.json",
    "osrm/v5/depart/southeast_159.json",
    "osrm/v5/depart/southwest_201.json",
    "osrm/v5/depart/southwest_249.json",
    "osrm/v5/depart/west_250.json",
    "osrm/v5/depart/west_290.json",
    "osrm/v5/end_of_road/left_default.json",
    "osrm/v5/end_of_road/left_destination.json",
    "osrm/v5/end_of_road/left_name.json",
    "osrm/v5/end_of_road/right_default.json",
    "osrm/v5/end_of_road/right_destination.json",
    "osrm/v5/end_of_road/right_name.json",
    "osrm/v5/end_of_road/sharp_left_default.json",
    "osrm/v5/end_of_road/sharp_left_destination.json",
    "osrm/v5/end_of_road/sharp_left_name.json",
    "osrm/v5/end_of_road/sharp_right_default.json",
    "osrm/v5/end_of_road/sharp_right_destination.json",
    "osrm/v5/end_of_road/sharp_right_name.json",
    "osrm/v5/end_of_road/slight_left_default.json",
    "osrm/v5/end_of_road/slight_left_destination.json",
    "osrm/v5/end_of_road/slight_left_name.json",
    "osrm/v5/end_of_road/slight_right_default.json",
    "osrm/v5/end_of_road/slight_right_destination.json",
    "osrm/v5/end_of_road/slight_right_name.json",
    "osrm/v5/end_of_road/straight_default.json",
    "osrm/v5/end_of_road/straight_destination.json",
    "osrm/v5/end_of_road/straight_name.json",
    "osrm/v5/end_of_road/uturn_default.json",
    "osrm/v5/end_of_road/uturn_destination.json",
    "osrm/v5/end_of_road/uturn_name.json",
    "osrm/v5/fork/left_default.json",
    "osrm/v5/fork/left_destination.json",
    "osrm/v5/fork/left_name.json",
    "osrm/v5/fork/right_default.json",
    "osrm/v5/fork/right_destination.json",
    "osrm/v5/fork/right_name.json",
    "osrm/v5/fork/sharp_left_default.json",
    "osrm/v5/fork/sharp_left_destination.json",
    "osrm/v5/fork/sharp_left_name.json",
    "osrm/v5/fork/sharp_right_default.json",
    "osrm/v5/fork/sharp_right_destination.json",
    "osrm/v5/fork/sharp_right_name.json",
    "osrm/v5/fork/slight_left_default.json",
    "osrm/v5/fork/slight_left_destination.json",
    "osrm/v5/fork/slight_left_name.json",
    "osrm/v5/fork/slight_right_default.json",
    "osrm/v5/fork/slight_right_destination.json",
    "osrm/v5/fork/slight_right_name.json",
    "osrm/v5/fork/straight_default.json",
    "osrm/v5/fork/straight_destination.json",
    "osrm/v5/fork/straight_name.json",
    "osrm/v5/fork/uturn_default.json",
    "osrm/v5/fork/uturn_destination.json",
    "osrm/v5/fork/uturn_name.json",
    "osrm/v5/merge/left_default.json",
    "osrm/v5/merge/left_destination.json",
    "osrm/v5/merge/left_name.json",
    "osrm/v5/merge/right_default.json",
    "osrm/v5/merge/right_destination.json",
    "osrm/v5/merge/right_name.json",
    "osrm/v5/merge/sharp_left_default.json",
    "osrm/v5/merge/sharp_left_destination.json",
    "osrm/v5/merge/sharp_left_name.json",
    "osrm/v5/merge/sharp_right_default.json",
    "osrm/v5/merge/sharp_right_destination.json",
    "osrm/v5/merge/sharp_right_name.json",
    "osrm/v5/merge/slight_left_default.json",
    "osrm/v5/merge/slight_left_destination.json",
    "osrm/v5/merge/slight_left_name.json",
    "osrm/v5/merge/slight_right_default.json",
    "osrm/v5/merge/slight_right_destination.json",
    "osrm/v5/merge/slight_right_name.json",
    "osrm/v5/merge/straight_default.json",
    "osrm/v5/merge/straight_destination.json",
    "osrm/v5/merge/straight_name.json",
    "osrm/v5/merge/uturn_default.json",
    "osrm/v5/merge/uturn_destination.json",
    "osrm/v5/merge/uturn_name.json",
    "osrm/v5/modes/driving_turn_left.json",
    "osrm/v5/modes/ferry_fork_left_default.json",
    "osrm/v5/modes/ferry_fork_left_destination.json",
    "osrm/v5/modes/ferry_fork_left_name.json",
    "osrm/v5/modes/ferry_turn_left_default.json",
    "osrm/v5/modes/ferry_turn_left_destination.json",
    "osrm/v5/modes/ferry_turn_left_name.json",
    "osrm/v5/new_name/left_default.json",
    "osrm/v5/new_name/left_destination.json",
    "osrm/v5/new_name/left_name.json",
    "osrm/v5/new_name/right_default.json",
    "osrm/v5/new_name/right_destination.json",
    "osrm/v5/new_name/right_name.json",
    "osrm/v5/new_name/sharp_left_default.json",
    "osrm/v5/new_name/sharp_left_destination.json",
    "osrm/v5/new_name/sharp_left_name.json",
    "osrm/v5/new_name/sharp_right_default.json",
    "osrm/v5/new_name/sharp_right_destination.json",
    "osrm/v5/new_name/sharp_right_name.json",
    "osrm/v5/new_name/slight_left_default.json",
    "osrm/v5/new_name/slight_left_destination.json",
    "osrm/v5/new_name/slight_left_name.json",
    "osrm/v5/new_name/slight_right_default.json",
    "osrm/v5/new_name/slight_right_destination.json",
    "osrm/v5/new_name/slight_right_name.json",
    "osrm/v5/new_name/straight_default.json",
    "osrm/v5/new_name/straight_destination.json",
    "osrm/v5/new_name/straight_name.json",
    "osrm/v5/new_name/uturn_default.json",
    "osrm/v5/new_name/uturn_destination.json",
    "osrm/v5/new_name/uturn_name.json",
    "osrm/v5/notification/left_default.json",
    "osrm/v5/notification/left_destination.json",
    "osrm/v5/notification/left_name.json",
    "osrm/v5/notification/right_default.json",
    "osrm/v5/notification/right_destination.json",
    "osrm/v5/notification/right_name.json",
    "osrm/v5/notification/sharp_left_default.json",
    "osrm/v5/notification/sharp_left_destination.json",
    "osrm/v5/notification/sharp_left_name.json",
    "osrm/v5/notification/sharp_right_default.json",
    "osrm/v5/notification/sharp_right_destination.json",
    "osrm/v5/notification/sharp_right_name.json",
    "osrm/v5/notification/slight_left_default.json",
    "osrm/v5/notification/slight_left_destination.json",
    "osrm/v5/notification/slight_left_name.json",
    "osrm/v5/notification/slight_right_default.json",
    "osrm/v5/notification/slight_right_destination.json",
    "osrm/v5/notification/slight_right_name.json",
    "osrm/v5/notification/straight_default.json",
    "osrm/v5/notification/straight_destination.json",
    "osrm/v5/notification/straight_name.json",
    "osrm/v5/notification/uturn_default.json",
    "osrm/v5/notification/uturn_destination.json",
    "osrm/v5/notification/uturn_name.json",
    "osrm/v5/off_ramp/left_default.json",
    "osrm/v5/off_ramp/left_destination.json",
    "osrm/v5/off_ramp/left_name.json",
    "osrm/v5/off_ramp/right_default.json",
    "osrm/v5/off_ramp/right_destination.json",
    "osrm/v5/off_ramp/right_name.json",
    "osrm/v5/off_ramp/sharp_left_default.json",
    "osrm/v5/off_ramp/sharp_left_destination.json",
    "osrm/v5/off_ramp/sharp_left_name.json",
    "osrm/v5/off_ramp/sharp_right_default.json",
    "osrm/v5/off_ramp/sharp_right_destination.json",
    "osrm/v5/off_ramp/sharp_right_name.json",
    "osrm/v5/off_ramp/slight_left_default.json",
    "osrm/v5/off_ramp/slight_left_destination.json",
    "osrm/v5/off_ramp/slight_left_name.json",
    "osrm/v5/off_ramp/slight_right_default.json",
    "osrm/v5/off_ramp/slight_right_destination.json",
    "osrm/v5/off_ramp/slight_right_name.json",
    "osrm/v5/off_ramp/straight_default.json",
    "osrm/v5/off_ramp/straight_destination.json",
    "osrm/v5/off_ramp/straight_name.json",
    "osrm/v5/off_ramp/uturn_default.json",
    "osrm/v5/off_ramp/uturn_destination.json",
    "osrm/v5/off_ramp/uturn_name.json",
    "osrm/v5/on_ramp/left_default.json",
    "osrm/v5/on_ramp/left_destination.json",
    "osrm/v5/on_ramp/left_name.json",
    "osrm/v5/on_ramp/right_default.json",
    "osrm/v5/on_ramp/right_destination.json",
    "osrm/v5/on_ramp/right_name.json",
    "osrm/v5/on_ramp/sharp_left_default.json",
    "osrm/v5/on_ramp/sharp_left_destination.json",
    "osrm/v5/on_ramp/sharp_left_name.json",
    "osrm/v5/on_ramp/sharp_right_default.json",
    "osrm/v5/on_ramp/sharp_right_destination.json",
    "osrm/v5/on_ramp/sharp_right_name.json",
    "osrm/v5/on_ramp/slight_left_default.json",
    "osrm/v5/on_ramp/slight_left_destination.json",
    "osrm/v5/on_ramp/slight_left_name.json",
    "osrm/v5/on_ramp/slight_right_default.json",
    "osrm/v5/on_ramp/slight_right_destination.json",
    "osrm/v5/on_ramp/slight_right_name.json",
    "osrm/v5/on_ramp/straight_default.json",
    "osrm/v5/on_ramp/straight_destination.json",
    "osrm/v5/on_ramp/straight_name.json",
    "osrm/v5/on_ramp/uturn_default.json",
    "osrm/v5/on_ramp/uturn_destination.json",
    "osrm/v5/on_ramp/uturn_name.json",
    "osrm/v5/other/invalid_type.json",
    "osrm/v5/other/way_name_ref.json",
    "osrm/v5/other/way_name_ref_destinations.json",
    "osrm/v5/other/way_name_ref_mapbox_hack_1.json",
    "osrm/v5/other/way_name_ref_mapbox_hack_2.json",
    "osrm/v5/other/way_name_ref_mapbox_hack_3.json",
    "osrm/v5/other/way_name_ref_name.json",
    "osrm/v5/rotary/default_default.json",
    "osrm/v5/rotary/default_destination.json",
    "osrm/v5/rotary/default_name.json",
    "osrm/v5/rotary/exit_10.json",
    "osrm/v5/rotary/exit_11.json",
    "osrm/v5/rotary/exit_1_default.json",
    "osrm/v5/rotary/exit_1_destination.json",
    "osrm/v5/rotary/exit_1_name.json",
    "osrm/v5/rotary/exit_2.json",
    "osrm/v5/rotary/exit_3.json",
    "osrm/v5/rotary/exit_4.json",
    "osrm/v5/rotary/exit_5.json",
    "osrm/v5/rotary/exit_6.json",
    "osrm/v5/rotary/exit_7.json",
    "osrm/v5/rotary/exit_8.json",
    "osrm/v5/rotary/exit_9.json",
    "osrm/v5/rotary/name_default.json",
    "osrm/v5/rotary/name_destination.json",
    "osrm/v5/rotary/name_exit_default.json",
    "osrm/v5/rotary/name_exit_destination.json",
    "osrm/v5/rotary/name_exit_name.json",
    "osrm/v5/rotary/name_name.json",
    "osrm/v5/roundabout/default_default.json",
    "osrm/v5/roundabout/default_destination.json",
    "osrm/v5/roundabout/default_name.json",
    "osrm/v5/roundabout/exit_default.json",
    "osrm/v5/roundabout/exit_destination.json",
    "osrm/v5/roundabout/exit_name.json",
    "osrm/v5/roundabout_turn/left_default.json",
    "osrm/v5/roundabout_turn/left_destination.json",
    "osrm/v5/roundabout_turn/left_name.json",
    "osrm/v5/roundabout_turn/right_default.json",
    "osrm/v5/roundabout_turn/right_destination.json",
    "osrm/v5/roundabout_turn/right_name.json",
    "osrm/v5/roundabout_turn/sharp_left_default.json",
    "osrm/v5/roundabout_turn/sharp_left_destination.json",
    "osrm/v5/roundabout_turn/sharp_left_name.json",
    "osrm/v5/roundabout_turn/sharp_right_default.json",
    "osrm/v5/roundabout_turn/sharp_right_destination.json",
    "osrm/v5/roundabout_turn/sharp_right_name.json",
    "osrm/v5/roundabout_turn/slight_left_default.json",
    "osrm/v5/roundabout_turn/slight_left_destination.json",
    "osrm/v5/roundabout_turn/slight_left_name.json",
    "osrm/v5/roundabout_turn/slight_right_default.json",
    "osrm/v5/roundabout_turn/slight_right_destination.json",
    "osrm/v5/roundabout_turn/slight_right_name.json",
    "osrm/v5/roundabout_turn/straight_default.json",
    "osrm/v5/roundabout_turn/straight_destination.json",
    "osrm/v5/roundabout_turn/straight_name.json",
    "osrm/v5/roundabout_turn/uturn_default.json",
    "osrm/v5/roundabout_turn/uturn_destination.json",
    "osrm/v5/roundabout_turn/uturn_name.json",
    "osrm/v5/turn/left_default.json",
    "osrm/v5/turn/left_destination.json",
    "osrm/v5/turn/left_name.json",
    "osrm/v5/turn/right_default.json",
    "osrm/v5/turn/right_destination.json",
    "osrm/v5/turn/right_name.json",
    "osrm/v5/turn/sharp_left_default.json",
    "osrm/v5/turn/sharp_left_destination.json",
    "osrm/v5/turn/sharp_left_name.json",
    "osrm/v5/turn/sharp_right_default.json",
    "osrm/v5/turn/sharp_right_destination.json",
    "osrm/v5/turn/sharp_right_name.json",
    "osrm/v5/turn/slight_left_default.json",
    "osrm/v5/turn/slight_left_destination.json",
    "osrm/v5/turn/slight_left_name.json",
    "osrm/v5/turn/slight_right_default.json",
    "osrm/v5/turn/slight_right_destination.json",
    "osrm/v5/turn/slight_right_name.json",
    "osrm/v5/turn/straight_default.json",
    "osrm/v5/turn/straight_destination.json",
    "osrm/v5/turn/straight_name.json",
    "osrm/v5/turn/uturn_default.json",
    "osrm/v5/turn/uturn_destination.json",
    "osrm/v5/turn/uturn_name.json",
    "osrm/v5/use_lane/o.json",
    "osrm/v5/use_lane/ooo.json",
    "osrm/v5/use_lane/oooxxo.json",
    "osrm/v5/use_lane/oox.json",
    "osrm/v5/use_lane/ooxx.json",
    "osrm/v5/use_lane/oxo.json",
    "osrm/v5/use_lane/xoo.json",
    "osrm/v5/use_lane/xox.json",
    "osrm/v5/use_lane/xxoo.json",
    "osrm/v5/use_lane/xxooxx.json",
    "osrm/v5/use_lane/xxoxo.json"};
}
