use std::collections::HashSet;

pub fn anagrams_for<'a>(word: &str, possible_anagrams: &[&'a str]) -> HashSet<&'a str> {
    let lower_word = word.to_lowercase();
    let mut chars: Vec<char> = lower_word.chars().collect();
    chars.sort();

    possible_anagrams
        .iter()
        .copied()
        .filter(|&candidate| {
            let mut target_chars: Vec<char> = candidate.to_lowercase().chars().collect();
            target_chars.sort();

            lower_word != candidate.to_lowercase() && chars == target_chars
        })
        .collect()
}
