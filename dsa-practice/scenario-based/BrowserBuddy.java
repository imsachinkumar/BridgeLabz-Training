import java.util.Stack;
// Doubly Linked List Node for History
class Page {
    String url;
    Page prev;
    Page next;

    Page(String url) {
        this.url = url;
    }
}
// Browser Tab with history
class BrowserTab {
    private Page current;

    // Visit new page
    public void visit(String url) {
        Page newPage = new Page(url);

        if (current != null) {
            current.next = null; // clear forward history
            newPage.prev = current;
            current.next = newPage;
        }

        current = newPage;
        System.out.println("Visited: " + url);
    }
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No page to go back");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Go forward
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No page to go forward");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current == null ? "No page open" : current.url;
    }
}
public class BrowserBuddy {
    private static Stack<BrowserTab> closedTabs = new Stack<>();
    public static void main(String[] args) {

        BrowserTab tab1 = new BrowserTab();

        tab1.visit("google.com");
        tab1.visit("github.com");
        tab1.visit("stackoverflow.com");

        tab1.back();
        tab1.back();
        tab1.forward();

        // Close tab
        closedTabs.push(tab1);
        System.out.println("Tab closed");

        // Restore tab
        if (!closedTabs.isEmpty()) {
            BrowserTab restoredTab = closedTabs.pop();
            System.out.println("Restored tab, current page: "
                    + restoredTab.getCurrentPage());
        }
    }
}
