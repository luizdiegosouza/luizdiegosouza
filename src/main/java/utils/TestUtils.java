package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

public class TestUtils {
    public static final Duration WAIT_30 = Duration.ofSeconds(30);
    public static final Duration WAIT_60 = Duration.ofSeconds(60);
    public static final Duration WAIT_5 = Duration.ofSeconds(5);
    public static final Duration WAIT_10 = Duration.ofSeconds(10);
}
