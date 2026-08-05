class Solution {

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] adjacencyList = new ArrayList[n];
        for (int index = 0; index < n; index++) {
            adjacencyList[index] = new ArrayList<>();
        }

        int[] indegreeCount = new int[n];

        for (int[] invocation : invocations) {
            adjacencyList[invocation[0]].add(invocation[1]);
            indegreeCount[invocation[1]]++;
        }

        Queue<Integer> bfs = new ArrayDeque<>();
        bfs.offer(k);

        boolean[] visited = new boolean[n];
        visited[k] = true;

        while (!bfs.isEmpty()) {
            int current = bfs.poll();

            for (int neighbor : adjacencyList[current]) {
                indegreeCount[neighbor]--;

                if (!visited[neighbor]) {
                    bfs.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        boolean removable = true;
        List<Integer> answer = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            if (visited[index] && indegreeCount[index] > 0) {
                removable = false;
                break;
            } else if (!visited[index]) {
                answer.add(index);
            }
        }

        if (!removable) {
            List<Integer> allMethods = new ArrayList<>(n);
            for (int index = 0; index < n; index++) {
                allMethods.add(index);
            }
            return allMethods;
        }

        return answer;
    }
}