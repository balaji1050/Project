/**
 * <p>Title: SystemManager</p>
 * <p>Description:</p>
 * @author Bradley Gude
 * @version 1.0
 */

package com.telepacific.merrt.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Hashtable;

import com.telepacific.merrt.config.SystemManager;

public class SystemManager {
    Hashtable<Date, String> events;

    private static SystemManager instance = null;

    public static SystemManager getInstance() {
        if (instance==null) {
            instance = new SystemManager();
        }
        return instance;
    }

    private SystemManager() {
        events = new Hashtable<Date, String>();
    }

    public void println(String str) {
        this.printline(str);
    }

    public void println(StringBuffer str) {
        this.printline(str!=null?str.toString():null);
    }

    public void println(Long str) {
        this.printline(str != null ? str.toString() : null);
    }

    public void println(Integer str) {
        this.printline(str != null ? str.toString() : null);
    }

    public void println(Boolean str) {
        this.printline(str != null ? str.toString() : null);
    }

    public void println(Date str) {
        this.printline(str != null ? str.toString() : null);
    }

    private void printline(String str) {
        if (1==1) return;
        events.put(new Date(), str);

        Date[] rtn = events.keySet().toArray(new Date[events.size()]);
        Arrays.sort(rtn, new Comparator<Date>() {
            @Override
			public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i=1000;i<rtn.length;i++) {
            events.remove(rtn[i]);
        }

    }

    public String[] getEvent(Long from) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa");
        Date[] dates = events.keySet().toArray(new Date[events.size()]);
        Arrays.sort(dates, new Comparator<Date>() {
            @Override
			public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });
        Hashtable<Date, String> rtning = new Hashtable<Date, String>();

        for (Date date : events.keySet()) {
            if (date.getTime() > from) {
//                System.out.println("event: " + date.getTime() + ", from: " + from);
                rtning.put(date, events.get(date));
            }
        }

        Date[] rtn2 = rtning.keySet().toArray(new Date[rtning.size()]);
        Arrays.sort(rtn2, new Comparator<Date>() {
            @Override
			public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        String[] rtn = new String[rtn2.length];
        for (int i = 0; i < rtn2.length; i++) {
//            System.out.println(rtning.get(rtn2[i]));
            rtn[i] = format.format(rtn2[i]) + " - " + rtning.get(rtn2[i]);
        }
        return rtn;
    }

    public String[] getEvent(int showevents) {
        Date[] dates = events.keySet().toArray(new Date[events.size()]);
        Arrays.sort(dates, new Comparator<Date>() {
            @Override
			public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });

        String[] rtn = new String[showevents];
        for (int i = 0; i < showevents; i++) {
            rtn[i] = events.get(dates);
        }
        return rtn;
    }
}
