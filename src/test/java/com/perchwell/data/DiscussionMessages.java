package com.perchwell.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiscussionMessages {
    private static DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    private static DateFormat emailDateFormat = new SimpleDateFormat("yyyyMMddHHmm");

    public static final String HELLO = "Hello";
    public static final String ADD_MESSAGE = "Add messsage " + simpleDateFormat.format(new Date());
    public static final String LETS_START_DISCUSSION = "Let_s start discussion " + simpleDateFormat.format(new Date());
    public static final String I_D_LIKE_TO_DISCUSS_WITH_YOU = "I_d_like_to_discuss_with_you "
            + simpleDateFormat.format(new Date());
    public static final String MESSAGE_FOR_REMOVING = "This_message_for_removing" + simpleDateFormat.format(new Date());
    public static final String MESSAGE = "Message" + emailDateFormat.format(new Date());
    public static final String CONTACT_AGENT_SUBJECT = "Subject" + emailDateFormat.format(new Date());
    public static final String REPORT_SUBJECT = "Report_Subject" + emailDateFormat.format(new Date());
}
